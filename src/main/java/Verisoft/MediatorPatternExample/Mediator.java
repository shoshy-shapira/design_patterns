package Verisoft.MediatorPatternExample;

/**
 * Mediator interface that defines the method for sending messages between colleagues.
 */
public interface Mediator {
    /**
     * Sends a message from one user to all other users.
     * @param message The message to be sent.
     * @param user The user sending the message.
     */
    void sendMessage(String message, User user);
}
