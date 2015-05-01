public class MethodInvocationUsingFunctionsClass {
    public static void main(String[] args) {
        // :: method invocation notation example: String::valueOf
        // pre-Java 8
        String oldStyleConstructorInvocation = new String();
        String oldStyleMethodInvocation = oldStyleConstructorInvocation.valueOf("10");
        System.out.println(oldStyleMethodInvocation);

        // Java 8
        MethodReference newStyleMethodReference = String::valueOf;
        String newStyleMethodInvocation = newStyleMethodReference.convert(10);
        System.out.println(newStyleMethodInvocation);
    }
}

@FunctionalInterface
interface MethodReference {
    public String convert(int value);
}
