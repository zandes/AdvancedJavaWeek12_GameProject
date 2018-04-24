package com.zachandes;

public class Magic extends CharacterDecorator {
    public Magic(Character tempCharacter){
        super(tempCharacter);
    }

    public String getName() {
        return tempCharacter.getName() + " The Mage";
    }

    public double getHealth(){
        return tempCharacter.getHealth() + 5;
    }
}
