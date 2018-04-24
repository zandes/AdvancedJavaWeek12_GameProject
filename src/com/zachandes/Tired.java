package com.zachandes;

public class Tired extends CharacterDecorator {
    public Tired(Character tempCharacter){
        super(tempCharacter);
    }

    public String getName() {
        return "Tired " + tempCharacter.getName();
    }

    public double getHealth(){
        return tempCharacter.getHealth() - 5;
    }
}
