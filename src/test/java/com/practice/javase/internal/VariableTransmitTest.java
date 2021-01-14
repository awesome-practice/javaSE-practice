package com.practice.javase.internal;

import org.junit.jupiter.api.Test;

/**
 * @author Luo Bao Ding
 * @since 1/14/2021
 */
public class VariableTransmitTest {


    @Test
    void testValueTrans() {
        int b = 3;
        System.out.println("b = " + b);
        print(b);
        System.out.println("b = " + b);

    }

    void print(int a) {
        System.out.println("a = " + a);
        a = 4;
        System.out.println("a = " + a);
    }

    @Test
    void testValueTransObject() {
        User b = new User("Jane",17);
        System.out.println("b = " + b);
        printObject(b);
        System.out.println("b = " + b);

    }

    void printObject(User a) {
        System.out.println("a = " + a);
        a=new User("Jane2",18);
        System.out.println("a = " + a);

    }

    static class User {
        String username;
        int age;
        public User(){}

        public User(String username, int age) {
            this.username = username;
            this.age = age;
        }

        @Override
        public String toString() {
            return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode())+"{" +
                    "username='" + username + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

}
