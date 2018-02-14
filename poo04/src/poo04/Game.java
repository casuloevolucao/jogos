package poo04;

public class Game {
	private Player player;
	private Inimigo inimigo;
	
	public Game(){
		//player = new Player();
		
		if (player == null) {
			System.out.println("O player n�o foi iniciado");
			player = new Player();
		} // vereifica��o da class player
		if (player instanceof Player) {
			System.out.println("o player foi inicializado com sucesso");
		}// verifica��o se realmete e uma class com instanceof
		inimigo = new Inimigo();
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Inimigo getInimigo() {
		return inimigo;
	}
	public static void main(String[] args) {
		
		Game game = new Game();
		Player player = game.getPlayer();
		player.atacarInimigo(game.getInimigo());
		
		System.out.println(game.getInimigo().life);
	}
}
