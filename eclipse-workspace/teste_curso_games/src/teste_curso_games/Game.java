package teste_curso_games;

public class Game {
	
	public static void main(String[] args) {
		Player player = new Player();
		
		System.out.println(player.vida);
		
		player.perderVida();
		player.perderVida();
		
		System.out.println(player.vida);
		
		player.ganharVida();
		
		System.out.println(player.vida);
	}
}
