
public class CampaignManager {
	
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : " + campaign.getName());
	}
	
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());
	}
	
	public void update(Campaign campaign) {
		System.out.println("Kampanya g�ncellendi : " + campaign.getName());
	}
	
	public void applyCampaign(Game game, Campaign campaign) {
		int a = game.getSalePrice()-((game.getSalePrice() * campaign.getPercentOfDiscount()) / 100);
		game.setSalePrice(a);
	}
}
