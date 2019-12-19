package com.company.Deneme;

public class English extends Greetings{

    @Override
    protected void morning() {
        System.out.println("Good morning my friend.");
    }

    @Override
    protected void afternoon() {
        System.out.println("Good afternoon my friend.");
    }

    @Override
    protected void evening() {
        System.out.println("Good evening my friend.");

    }

    @Override
    protected  boolean withRespect(){
        return true;
    }

    @Override
    protected void respect() {
        System.out.println("Have a good day sir");
    }
}
