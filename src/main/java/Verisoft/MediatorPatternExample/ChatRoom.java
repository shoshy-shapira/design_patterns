package Verisoft.MediatorPatternExample;

import java.util.ArrayList;
import java.util.List;

/**
 * ChatRoom class implements the Mediator interface and facilitates communication between users.
 */
public class ChatRoom implements Mediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    /**
     * Adds a user to the chat room.
     * @param user The user to be added.
     */
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // send the message to every user except the sender
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
