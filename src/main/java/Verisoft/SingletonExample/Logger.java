package Verisoft.SingletonExample;

/**
 * Logger class implemented as a Singleton to ensure only one instance is created.
 * This class provides a logging functionality throughout the application.
 */
public class Logger {
    // The single instance of Logger
    private static Logger instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private Logger() {
    }

    /**
     * Returns the single instance of the Logger class.
     * Uses synchronized to make it thread-safe.
     * If the instance does not exist, it creates it.
     *
     * @return The single instance of Logger.
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Logs a message to the system output.
     *
     * @param message The message to log.
     */
    public void log(String message) {
        System.out.println("Log message: " + message);
    }
}
