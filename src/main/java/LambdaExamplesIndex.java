// http://winterbe.com/posts/2014/03/16/java-8-tutorial/
// http://radar.oreilly.com/2014/04/whats-new-in-java-8-lambdas.html
public class LambdaExamplesIndex {
    public static void main(String[] args) {
        // interface implementation example: (int x, int y) -> x + y;
        // interfaceImplementationClass();

        // lambda with side-effect example: (String s) -> { System.out.println(s); };
        // lambdaWithSideEffectClass();

        // Runnable is a @FunctionalInterface
        // runnableInterfaceClass();

        // :: method invocation notation example: String::valueOf
        // methodInvocationUsingFunctionsClass();

        // :: constructor notation example: String::new
        // methodInvocationUsingConstructorClass();

        // forEach method example: pointList.forEach(p -> p.move(p.y, p.x));
        // forEachMethodInCollectionsClass();

        // @FunctionalInterface example: (TransPoint pt) -> { pt.transpose(); }
        // functionalInterfaceClass()

        // lambda constant value example: () -> 42;
        // interfaceReturnsConstantClass()
    }
}