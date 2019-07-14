package db;

import model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DatabaseUsers {
    List<User> dbUsers = new ArrayList<>();
    private static int counter = 0;

    public DatabaseUsers() {
        if (dbUsers.isEmpty()) {
            dbUsers.add(new User(counter, "admin", "admin", "admin"));
            counter++;
        }
    }

    public void add(User user) {
        user.setId(counter);
        if (!dbUsers.contains(user)) {
            dbUsers.add(user);
            counter++;
        }
    }

    public List<User> getAll() {
        return dbUsers;
    }

    public User checkIsPresenAndGetFullUserData(User user) {
        Iterator<User> iterator = dbUsers.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (user.getEmail().equals(next.getEmail()) && user.getPassword().equals(next.getPassword())) {
                return next;
            }
        }
        return null;
    }

    public void change(int id, User user) {
        dbUsers.set(id, user);
    }

    public void deleteUser(int id) {
        dbUsers.remove(id);
    }
}
