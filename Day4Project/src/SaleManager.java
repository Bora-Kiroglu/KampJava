
public class SaleManager {
	
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " oyunu "+ game.getSalePrice() + " fiyat�ndan " + gamer.getFirstName() + " taraf�ndan sat�n al�nd�");
	}
	
	public void returnOfSale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " taraf�ndan iade edildi");
	}
	

}
