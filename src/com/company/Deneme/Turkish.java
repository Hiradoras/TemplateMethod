package com.company.Deneme;

public class Turkish extends Greetings{

    @Override
    protected void morning() {
        System.out.println("Gunaydin dostum.");
    }

    @Override
    protected void afternoon() {
        System.out.println("Iyi gunler dostum");
    }

    @Override
    protected void evening() {
        System.out.println("Iyi aksamlar dostum");
    }

    @Override
    protected boolean withRespect(){
        return false;
    }

    @Override
    protected void respect() {
        System.out.println("Iyi gunler efendim");
    }
}
