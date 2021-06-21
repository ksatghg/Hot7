package galag;

import java.awt.Image;

public class StarShipSprite extends Sprite{
	private GalagaGame game;
	
	public StarShipSprite(GalagaGame game, Image image, int x, int y) {
		super(image, x, y);
		this.game=game;
		dx=0;
		dy=0;
		
	}
	
	@Override
	public void move() {
		if(dx<0 && x<10) {
			return; //끝에가면 더 못움직이게
		}
		if(dx>0 && x>800) {
			return;
		}
		super.move();
	}
@Override
public void handleCollision(Sprite other) {
	if(other instanceof AlienSprite) {
		game.endGame();
	}
	
}
}
