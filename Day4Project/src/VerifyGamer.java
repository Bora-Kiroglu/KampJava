
public class VerifyGamer {
	public static Boolean Verify(Person person, Customer customer) {
		if(person.getNationalIdentity() == customer.getNationalIdentity()) {
			return true;
		}
		
		return false;
	}
}
