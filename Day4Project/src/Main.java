
public class Main {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setNationalIdentity("10011133310");
		person1.setFirstName("Ali");
		person1.setLastName("Demir");
		person1.setBirthYear(1993);
		
		Customer customer1 = new Customer();
		customer1.setNationalIdentity("10011133310");
		customer1.setFirstName("Ali");
		customer1.setLastName("Demir");
		customer1.setBirthYear(1993);
		customer1.setCardNo("1111 2222 3333 4444");
		
		GamerManager gamerManager = new GamerManager();
		Gamer gamer1 = gamerManager.add(person1, customer1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Age of Empires 2");
		game1.setSalePrice(32);
		game1.setUnitsInStock(10);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(gamer1, game1);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName("Yaz Ýndirimi");
		campaign1.setPercentOfDiscount(25);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.applyCampaign(game1, campaign1);
		
		saleManager.sale(gamer1, game1);
	}

}
