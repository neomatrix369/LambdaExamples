public class LambdaWithSideEffectClass {
    public static void main(String[] args) {
        // lambda with side-effect example: (String s) -> { System.out.println(s); };
        // pre-Java 8
        PrintInterface oldStyleInterface = new PrintInterface() {
            @Override
            public void print(String something) {
                System.out.println(something);
            }
        };
        oldStyleInterface.print("A string to print");

        // Java 8
        PrintInterface newStyleInterface = (String s) -> {
            System.out.println(s);
        };
        newStyleInterface.print("A string to print");
    }
}

interface PrintInterface {
    void print(String something);
}

