
public class SaleManager {
	
	public void sale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " oyunu "+ game.getSalePrice() + " fiyatýndan " + gamer.getFirstName() + " tarafýndan satýn alýndý");
	}
	
	public void returnOfSale(Gamer gamer, Game game) {
		System.out.println(game.getName() + " oyunu " + gamer.getFirstName() + " tarafýndan iade edildi");
	}
	

}
