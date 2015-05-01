public class InterfaceImplementationClass {
    public static void main(String[] args) {
        // interface implementation example: (int x, int y) -> x + y;
        // pre-Java 8
        InterfaceImplementation
                oldStyleInterfaceImplementation = new InterfaceImplementation() {
            @Override
            public int addTwoNumbers(int x, int y) {
                return x + y;
            }
        };
        int oldStyleResult = oldStyleInterfaceImplementation.addTwoNumbers(5,1);
        System.out.println(oldStyleResult);

        // Java 8
        InterfaceImplementation
                newStyleInterfaceImplementation = (int x, int y) -> x + y;
        int newStyleResult = newStyleInterfaceImplementation.addTwoNumbers(4,5);
        System.out.println(newStyleResult);
    }
}

interface InterfaceImplementation {
    int addTwoNumbers(int x, int y);
}