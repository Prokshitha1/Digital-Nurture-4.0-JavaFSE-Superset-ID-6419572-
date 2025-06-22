// Logger.java
public class Logger {
    // Static variable to hold single instance
    private static Logger singleInstance;

    // Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Public static method to provide access to the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Example logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
