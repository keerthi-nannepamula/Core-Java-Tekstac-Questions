
public class WoodenBero extends Bero{
	
	private String woodType;

	public String getWoodType() {
		return woodType;
	}
	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

	public WoodenBero(String beroType, String beroColour, String woodType) {
		super(beroType, beroColour);
		this.woodType = woodType;
	}
	
	public void calculatePrice() {
		if(this.getWoodType().equals("Ply Wood")) {
			this.setPrice(15000);
		}else if(this.getWoodType().equals("Teak Wood")) {
			this.setPrice(12000);
		}else if(this.getWoodType().equals("Engineered Wood")) {
			this.setPrice(10000);
		}		
	}

}
