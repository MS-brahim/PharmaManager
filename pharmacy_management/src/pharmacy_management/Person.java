package pharmacy_management;
import java.util.ArrayList;

public class Person {
	private long id;
	private String fname;
	private String lname;
	private String phone;
	private String email;
	
	public Person(long id, String fname, String lname, String phone, String email) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.email = email;
	}

	public Person() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Method Create, Read, Update, Delete
	public String createData(ArrayList<Person> personList, Person person) {
		try {
			personList.add(person);
			return "Person is Added";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}
	
	public String readData(ArrayList<Person> personList) {
		try {
			String cpm="";
			for (Person person : personList) {
				cpm += person.toString();
			} 
			return cpm;
		}catch(Exception ex) {
			return ex.getMessage();
			
		}
	}
	
	public String updateData(ArrayList<Person> personList,Person person, int index) {
		try {
			personList.set(index, person);
			return "Person Edited";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}
	
	public String deleteData(ArrayList<Person> personList, int index) {
		try {
			personList.remove(index);
			return "Person Removed";
		}catch(Exception ex) {
			return ex.getMessage();
		}
	}
}
