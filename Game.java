package dev.GameTutoring.Kyley_Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.GameTutoring.Kyley_Game.Display.Display;
import dev.GameTutoring.Kyley_Game.States.GameState;
import dev.GameTutoring.Kyley_Game.States.State;

public class Game implements Runnable{
	private Display display;
	
	
	
	
	
	int x;
	String b = "hello";
	
	
	
	private Thread thread;
	private boolean running = false;
	private BufferStrategy bs;
	private Graphics g;
	private String title;
	private int width, height;
	private GameState gameState;
	

	
	private static int baseFPS = 60;
	private static double MS_PER_UPDATE = 1000000000/baseFPS;
	
	Game(String t, int w, int h){
		title = t;
		width = w;
		height = h;
	}
	
	private void update(double deltaTimeUpdate){
		if(State.getState() != null)
			State.getState().tick(deltaTimeUpdate);
	}
	private void render(double deltaTimeRender){
		bs = display.getCanvas().getBufferStrategy();
		if (bs  == null){
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.setColor(Color.red);
		g.clearRect(0, 0, width, height);
		
		if(State.getState() != null)
			State.getState().render(g, deltaTimeRender);

		bs.show();
		g.dispose();
	}
	
	private void init(){
		display = new Display(title, width, height);
		gameState = new GameState(this);
		State.setState(gameState);
	}
	
	public synchronized void start(){
		if (running) return;
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	private void stop(){
		if(!running) return;
		running = false;
		try {
			thread.join();
		} catch(InterruptedException e) {
			
		}
	}
	public void run() {
		init();
		double previousTime = System.nanoTime();
		double deltaTime = 0;
		while (true) {
			double currentTime = System.nanoTime();
			double elapsedTime = currentTime - previousTime;
			previousTime = currentTime;
			deltaTime += elapsedTime;
			while (deltaTime >= MS_PER_UPDATE) {
				update(deltaTime/MS_PER_UPDATE); //passing in a scalar for logic normalization across processing speeds
				render(deltaTime/MS_PER_UPDATE); //passing in a scalar for rendering
				deltaTime -= MS_PER_UPDATE;
			}
			//render(deltaTime/MS_PER_UPDATE);
			//render(deltaTime/MS_PER_UPDATE);//passing in (deltaTime / MS_PER_UPDATE) for smooth rendering
		}
	}
	public Graphics getGraphics(){
		return this.g;
	}
}
