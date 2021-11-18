package javagame;
import java.awt.DisplayMode;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{
	
	public static final String gamename="Save Your Love!";
	public static final int manu = 0;
	public static final int play = 1;
	
	public Game(String gamename) {
		super(gamename);
		this.addState(new Manu(manu));
		this.addState(new Play(play));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(manu).init(gc, this);
		this.getState(play).init(gc, this);
		this.enterState(manu);
		//this.enterState(play);
	}
	

	public static void main(String[] args) {
		AppGameContainer appgc;
		 try {
			 DisplayMode dm = new DisplayMode(640, 360, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(640,360,true);
			appgc.start();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
