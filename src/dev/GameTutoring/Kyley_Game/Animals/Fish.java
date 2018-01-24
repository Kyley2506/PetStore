package dev.GameTutoring.Kyley_Game.Animals;

import dev.GameTutoring.Kyley_Game.Enum.Fish_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Fish extends Animals{
public Fish(int price, Hunger hunger, Thirst thirst, Restroom restroom, Fish_Type fish_type, int x, int y ) {
		super(price, hunger, thirst, restroom, x, y);
		this.fish_type = fish_type;
		switch(fish_type) {
		case BLUE_FISH:
			break;
		case ORANGE_FISH:
			break;
		case PINK_FISH:
			break;
		case YELLOW_FISH:
			break;
		default:
			break;
	
		}
	}

Fish_Type fish_type;
}
