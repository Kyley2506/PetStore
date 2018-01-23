package dev.GameTutoring.Kyley_Game.Animals;

import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import dev.GameTutoring.Kyley_Game.Enum.Bird_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class Bird extends Animals{
public Bird(int price, Hunger hunger, Thirst thirst, Restroom restroom, Bird_Type bird_type) {
		super(price, hunger, thirst, restroom);
		this.bird_type = bird_type;
		
		switch(bird_type) {
		case YELLOW_BIRD:{
			try {
				this.animalPictures = ImageIO.read(new FileInputStream("res/BirdYellow.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			break;
		case BLUE_BIRD:{
			try {
				this.animalPictures = ImageIO.read(new FileInputStream("res/BirdBlue.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			break;
		case GREEN_BIRD:{
			try {
				this.animalPictures = ImageIO.read(new FileInputStream("res/BirdGreen.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			break;
		case WHITE_BIRD:{
			try {
				this.animalPictures = ImageIO.read(new FileInputStream("res/BirdWhite.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			break;
		default:
			break;
		
		}
	}

Bird_Type bird_type;
}
