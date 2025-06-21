public class SingletonTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.Login("Sakthi");

        Logger logger2 = Logger.getInstance();
        Logger logger3 = Logger.getInstance();

        if (logger == logger2 && logger == logger3) {
            System.out.println("The same instance is shared across all calls, ensuring the Singleton pattern is correctly implemented");
        } else {
            System.out.println("Error. Multiple Singletons were created!");
        }
    }
}
