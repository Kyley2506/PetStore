package dev.GameTutoring.Kyley_Game.States;

import java.awt.Graphics;

import dev.GameTutoring.Kyley_Game.Game;
import dev.GameTutoring.Kyley_Game.Animals.Bird;
import dev.GameTutoring.Kyley_Game.Enum.Bird_Type;
import dev.GameTutoring.Kyley_Game.Enum.Hunger;
import dev.GameTutoring.Kyley_Game.Enum.Restroom;
import dev.GameTutoring.Kyley_Game.Enum.Thirst;

public class GameState extends State {
	
	Bird f;
	Bird Limeade;
	
	public GameState(Game game) {
		super(game);
		f = new Bird(3, Hunger.SUPER_HUNGERY, Thirst.QUINCHED, Restroom.UNCLEAN, Bird_Type.YELLOW_BIRD);
		Limeade = new Bird(10, Hunger.PECKISH, Thirst.QUINCHED, Restroom.CLEAN, Bird_Type.GREEN_BIRD);
	
	}

	@Override
	public void tick(double deltaTimeUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g, double deltaTimeUpdate) {
		// TODO Auto-generated method stub
		g.drawImage(f.animalPictures, 1365/2, 710/2, null);
		g.drawImage(Limeade.animalPictures, 1065, 710/5, null);
	}

}
