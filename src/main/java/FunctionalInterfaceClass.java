public class FunctionalInterfaceClass {
    public static void main(String[] args) {
        // @FunctionalInterface example: (TransPoint pt) -> { pt.transpose(); }
        // pre-Java 8
        // no equivalent implementation or a lengthy way to do it

        // Java 8
        FunctionalIntf functionalIntf = (TransPoint pt) -> { pt.transpose(); };
        functionalIntf.someMethod(new TransPoint());

        AnotherFunctionalIntf anotherFunctionalIntf = () -> { TransPoint.anotherTranspose(); };
        anotherFunctionalIntf.someMethod();
    }
}

@FunctionalInterface
interface FunctionalIntf {
    public void someMethod(TransPoint value);
}

@FunctionalInterface
interface AnotherFunctionalIntf {
    public void someMethod();
}

class TransPoint {
    public void transpose() {
        System.out.println("TransPoint.transpose() called");
    }

    public static void anotherTranspose() {
        System.out.println("TransPoint.anotherTranspose() called");
    }
}