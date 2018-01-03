package dev.GameTutoring.Kyley_Game.States;

import java.awt.Graphics;

import dev.GameTutoring.Kyley_Game.Game;
import dev.GameTutoring.Kyley_Game.Animals.cat;

public class GameState extends State {
	cat ryan;
	cat violete;
	
	public GameState(Game game) {
		super(game);
		ryan = new cat("RyanCat");
		violete = new cat("Purple_Cat");
		
	}

	@Override
	public void tick(double deltaTimeUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g, double deltaTimeUpdate) {
		// TODO Auto-generated method stub
		g.drawImage(ryan.catpic, 1365/2, 710/2, null);
		g.drawImage(violete.catpic, 1065, 710/5, null);
	}

}
