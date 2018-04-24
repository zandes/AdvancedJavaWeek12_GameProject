package com.zachandes;

public class Fists extends CharacterDecorator {
    public Fists(Character tempCharacter){
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Monk";
    }

    public double getHealth(){
        return tempCharacter.getHealth() + 15;
    }
}
