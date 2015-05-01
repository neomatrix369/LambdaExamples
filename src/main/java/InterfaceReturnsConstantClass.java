public class InterfaceReturnsConstantClass {
    public static void main(String[] args) {
        // lambda constant value example: () -> 42;
        // pre-Java 8
        ConstantInterface oldStyleConstantInterface = new ConstantInterface() {
            @Override
            public int getValue() {
                return 42;
            }
        };
        System.out.println(oldStyleConstantInterface.getValue());

        // Java 8
        ConstantInterface newStyleConstantInterface = () -> 42;
        System.out.println(newStyleConstantInterface.getValue());
    }
}

interface ConstantInterface {
    int getValue();
}
