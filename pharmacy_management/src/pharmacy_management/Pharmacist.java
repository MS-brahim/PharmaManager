package pharmacy_management;

public class Pharmacist extends Person {
	
	public Pharmacist() {

	}

	public Pharmacist(long id, String fname, String lname, String phone, String email) {
	}

	@Override
	public String toString() {
		return "Pharmacist [Id =" + getId() + ", Firstname =" + getFname() + ", Lastname =" + getLname()
				+ ", Phone =" + getPhone() + ", Email =" + getEmail() + "]";
	}
}
