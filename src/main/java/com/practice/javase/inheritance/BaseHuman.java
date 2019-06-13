package com.practice.javase.inheritance;

/**
 * @author Luo Bao Ding
 * @since 2018/12/14
 */
public class BaseHuman {

    protected void speak() {
        greet();
        wish();
    }

    private void greet() {
        System.out.println("hello human");
    }

    protected void wish() {
        System.out.println("my best wish to you human");
    }
}
