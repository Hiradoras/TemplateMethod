package com.company.Deneme;

public abstract class Greetings {
    public final void template(){
        morning();
        afternoon();
        evening();
        if (withRespect()){
            respect();
        }

    }
    protected abstract void morning();

    protected abstract void afternoon();

    protected abstract void evening();

    protected boolean withRespect(){
        return true;
    }
    protected abstract void respect();
}
