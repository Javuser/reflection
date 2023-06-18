package com.example.reflection;



import java.util.StringJoiner;

public class User {
    private String firstName;
    private String lastName;
    private Integer height;

    public User() {
        this.firstName = "Nurbakyt";
        this.lastName = "Agybetov";
        this.height = 178;
    }

    public User(String firstName, String lastName, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public int grow(Integer value) {
        this.height += value;
        return height;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("height=" + height)
                .toString();
    }
//
}
