package com.practice.javase.inheritance;

/**
 * @author Luo Bao Ding
 * @since 2018/12/14
 */
public class Man extends BaseHuman {

    public void action() {
        speak();
    }

    protected void sayGreeting() {
        System.out.println("hello man!");
    }

    protected void wish(){
        System.out.println("my best wish to you man");
    }

    public static void main(String[] args) {
        new Man().action();
    }
}
