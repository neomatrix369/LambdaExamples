public class MethodInvocationUsingConstructorClass {
    public static void main(String[] args) {
        // :: constructor notation example: String::new
        // pre-Java 8
        Thread oldStyleConstructorInvocation = new Thread(new String());
        oldStyleConstructorInvocation.start();

        // Java 8
        Thread newStyleMethodReference = new Thread(String::new);
        newStyleMethodReference.start();
    }
}
