package dev.GameTutoring.Kyley_Game.Animals;

import dev.GameTutoring.Kyley_Game.Enum.Cat_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Cat extends Animals{
public Cat(int price, Hunger hunger, Thirst thirst, Restroom restroom, int x, int y ) {
		super(price, hunger, thirst, restroom, x, y);
		// TODO Auto-generated constructor stub
	}

Cat_Type cat_type;
}
