package org.libr.models;
import org.libr.patterns.Observer;
import java.util.ArrayList;
import java.util.List;

public class User extends BaseEntity implements Observer {
    private String name;
    private String email;
    private List<String> notifications = new ArrayList<>();

    public User(int id, String name, String email) {
        super(id);
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String message) {
        notifications.add(message);
        System.out.println("Notification for " + name + ": " + message);
    }