package pharmacy_management;

public class Pharmacist extends Person {
	
	public Pharmacist() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Pharmacist [Id =" + getId() + ", Firstname =" + getFname() + ", Lastname =" + getLname()
				+ ", Phone =" + getPhone() + ", Email =" + getEmail() + "]";
	}
}
