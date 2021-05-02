
public class GamerManager {
	public Gamer add(Person person, Customer customer) {
		if(VerifyGamer.Verify(person, customer)) {
			Gamer gamer = new Gamer();
			gamer.setFirstName(person.getFirstName());
			gamer.setLastName(person.getLastName());
			gamer.setBirthYear(person.getBirthYear());
			gamer.setNationalIdentity(person.getNationalIdentity());
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName());
			return gamer;
		}
		System.out.println("Bilgiler uyuþmadý");
		return null;
		
	}
	
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName());
	}
	
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName());
	}
}
