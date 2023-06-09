package zelda_mini_clone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {

	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	public static BufferedImage[] enemy_front;
	
	public SpriteSheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		player_front = new BufferedImage[2];
		enemy_front = new BufferedImage[2];
		
		player_front[0] = SpriteSheet.getSprite(1, 11, 15, 16);
		player_front[1] = SpriteSheet.getSprite(17, 11, 15, 16);
		
		enemy_front[0] = SpriteSheet.getSprite(35, 232, 15, 16);
		enemy_front[1] = SpriteSheet.getSprite(35, 249, 15, 16);
	}
	
	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
}
