package com.java.test;

public interface UserDAO {
User loadByUserNameAndPassword(String username, String password);
}
