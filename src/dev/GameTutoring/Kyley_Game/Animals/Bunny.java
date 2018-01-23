package dev.GameTutoring.Kyley_Game.Animals;

import dev.GameTutoring.Kyley_Game.Enum.Bunny_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Bunny extends Animals{
public Bunny(int price, Hunger hunger, Thirst thirst, Restroom restroom, Bunny_Type bunny_type) {
		super(price, hunger, thirst, restroom);
		this.bunny_type = bunny_type;
		switch(bunny_type) {
		case BLACK_BUNNY:
			break;
		case BLUE_BUNNY:
			break;
		case GREY_BUNNY:
			break;
		case PINK_BUNNY:
			break;
		default:
			break;
		
		}
	}

Bunny_Type bunny_type;
}
