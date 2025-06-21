public class Logger {
    private static Logger instance;
    private static int countOfLoggers = 0;

   
    private Logger() {
        System.out.println("A new Log has been created!");
        countOfLoggers++;
        instance = this;
    }

    
    public static Logger getInstance() {
        System.out.println("Count of Log: " + countOfLoggers);
        if (instance == null) 
        {
            return new Logger();
        }
         else
          {
            return instance;
        }
    }

    public void Login(String username) {
        System.out.println(username + " has log in.");
    }
}
