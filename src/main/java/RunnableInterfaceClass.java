public class RunnableInterfaceClass {
    public static void main(String[] args) {
        // Runnable example
        // Runnable is a @FunctionalInterface
        // pre-Java 8
        Runnable runnableOldStyle = new Runnable() {
            @Override
            public void run() {
            }
        };
        runnableOldStyle.run(); // typically you would pass it to the Thread object
                                // and not invoke run()

        // Java 8
        // creates a lambda expression and assigns a reference to this lambda to r 
        Runnable runnableNewStyle = () -> {};
        runnableNewStyle.run();  // typically you would pass it to the Thread object
                                 // and not invoke run()
    }
}
