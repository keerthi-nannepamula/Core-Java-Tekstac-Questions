
public class Product {
	//Include the attributes
	private int productid;
	private String productName;
	private double price;	
	
	//This method should return the productId, productName and price seperated by whitespace
	public String toString()
    	{
            return this.productid+" "+this.productName+" "+this.price;
    	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product(int productid, String productName, double price) {
		super();
		this.productid = productid;
		this.productName = productName;
		this.price = price;
	}
	
}
