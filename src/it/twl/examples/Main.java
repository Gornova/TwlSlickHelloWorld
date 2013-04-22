package it.twl.examples;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class Main extends BasicGame {

	public Main(String title) {
		super(title);
	}

	@Override
	public void init(GameContainer container) throws SlickException {
	}

	@Override
	public void render(GameContainer container, Graphics g)
			throws SlickException {
	}

	@Override
	public void update(GameContainer container, int delta)
			throws SlickException {
	}

	public static void main(String[] args) throws SlickException {
		Main game = new Main("Twl Slick Hello World");
		AppGameContainer container = new AppGameContainer(game);
		container.setDisplayMode(1024, 768, false);
		container.setAlwaysRender(true);
		container.setTargetFrameRate(40);
		container.start();
	}
}
