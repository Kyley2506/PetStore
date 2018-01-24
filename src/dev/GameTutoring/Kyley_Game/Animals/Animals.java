package dev.GameTutoring.Kyley_Game.Animals;

import java.awt.image.BufferedImage;

import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Animals {
public	BufferedImage animalPictures;
	Hunger hunger;
	Thirst thirst;
	Restroom restroom;
	public int x, y;
	int price;
	
	public Animals(int price, Hunger hunger, Thirst thirst, Restroom restroom, int x, int y){
		this.price = price;
		this.hunger = hunger;
		this.thirst = thirst;
		this.restroom = restroom;
	    this.x = x;
	    this.y = y;
	}
	
	
	
}
