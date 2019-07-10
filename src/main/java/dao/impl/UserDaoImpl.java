package dao.impl;

import dao.UserDao;
import db.DatabaseUsers;
import model.User;

import java.util.Map;

public class UserDaoImpl implements UserDao {
    private DatabaseUsers databaseUsers;

    public UserDaoImpl() {
        if (databaseUsers == null) {
            databaseUsers = new DatabaseUsers();
        }
    }

    @Override
    public void addUser(User user) {
        databaseUsers.add(user);
    }

    @Override
    public Map<Integer, User> getAllUsers() {
        return databaseUsers.getAll();
    }

    @Override
    public boolean checkIsPresent(User user) {
        return databaseUsers.check(user);
    }

    @Override
    public void edit(User user) {
        databaseUsers.edit(user);
    }


    @Override
    public void deleteUser(Integer key) {
        databaseUsers.deleteUser(key);
    }
}
