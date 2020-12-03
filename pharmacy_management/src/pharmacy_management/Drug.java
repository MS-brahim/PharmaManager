package pharmacy_management;

public class Drug {
	private long id;
	private String describe;
	private String price;
	
	public Drug(long id, String describe, String price) {
		this.id = id;
		this.describe = describe;
		this.price = price;
	}
	
	public Drug() {
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Drug [Id=" + id + ", Describe=" + describe + ", Price=" + price + "]";
	}	
}
