package dev.GameTutoring.Kyley_Game.Animals;

import dev.GameTutoring.Kyley_Game.Enum.Dog_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Dog extends Animals{
public Dog(int price, Hunger hunger, Thirst thirst, Restroom restroom, int x, int y ) {
		super(price, hunger, thirst, restroom, x, y);
		// TODO Auto-generated constructor stub
	}

Dog_Type dog_type;
}
