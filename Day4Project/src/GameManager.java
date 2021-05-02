
public class GameManager {
	
	public void add(Game game) {
		System.out.println("Oyun sisteme eklendi : " + game.getName());
	}
	
	public void delete(Game game) {
		System.out.println("Oyun sistemden silindi : " + game.getName());
	}
	
	public void update(Game game) {
		System.out.println("Oyun sistemde güncellendi : " + game.getName());
	}
	

}
