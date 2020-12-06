package pharmacy_management;

public class Customer extends Person{
	
	private long badge;


	public Customer() {
		super();
	}

	public Customer(long id, String fname, String lname, String phone, String email, long badge) {
		super(id, fname, lname, phone, email);
		this.badge = badge;
	}
	

	public long getBadge() {
		return badge;
	}

	public void setBadge(long badge) {
		this.badge = badge;
	}
	
	@Override
	public String toString() {
		return "Customer [Id =" + getId() + ", Firstname =" + getFname() + ", Lastname =" + getLname()
				+ ", Phone =" + getPhone() + ", Email =" + getEmail() + ", Badge =" + getBadge() +"]";
	}
}
