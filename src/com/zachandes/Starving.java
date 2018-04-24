package com.zachandes;

public class Starving extends CharacterDecorator {
    public Starving(Character tempCharacter){
        super(tempCharacter);
    }

    public String getName() {
        return "Starving " + tempCharacter.getName();
    }

    public double getHealth(){
        return tempCharacter.getHealth() - 10;
    }
}
