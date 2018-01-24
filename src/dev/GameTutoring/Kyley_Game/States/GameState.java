package dev.GameTutoring.Kyley_Game.States;

import java.awt.Graphics;

import dev.GameTutoring.Kyley_Game.Game;
import dev.GameTutoring.Kyley_Game.Animals.Bird;
import dev.GameTutoring.Kyley_Game.Enum.Bird_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class GameState extends State {
	Bird Kiwi;

	
	public GameState(Game game) {
		super(game);
		Kiwi = new Bird(15, Hunger.FULL, Thirst.QUINCHED, Restroom.CLEAN, Bird_Type.GREEN_BIRD, 1365/2, 710/2);
	}

	@Override
	public void tick(double deltaTimeUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g, double deltaTimeUpdate) {
		g.drawImage(Kiwi.animalPictures, Kiwi.x, Kiwi.y, null);
		// TODO Auto-generated method stub
	}

}
