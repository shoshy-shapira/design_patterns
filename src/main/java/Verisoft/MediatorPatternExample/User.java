package Verisoft.MediatorPatternExample;

/**
 * The User class represents a user in the chat room who can send and receive messages.
 */
public class User {
    private String name;
    private Mediator chatRoom;

    public User(String name, Mediator chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    /**
     * Sends a message to the chat room.
     * @param message The message to be sent.
     */
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        chatRoom.sendMessage(message, this);
    }

    /**
     * Receives a message from the chat room.
     * @param message The message received.
     */
    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
