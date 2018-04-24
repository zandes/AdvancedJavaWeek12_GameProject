package com.zachandes;

public class Peasant extends CharacterDecorator{
    public Peasant(Character tempCharacter){
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Peasant";
    }

    public double getHealth(){
        return tempCharacter.getHealth() + 1;
    }
}
