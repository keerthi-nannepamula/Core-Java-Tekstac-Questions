
public class SteelBero extends Bero{

	private int beroHeight;
	
	public int getBeroHeight() {
		return beroHeight;
	}
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

	public SteelBero(String beroType, String beroColour,int beroHeight) {
		super(beroType, beroColour);
		this.beroHeight=beroHeight;
	}
	
	public void calculatePrice() {
		if(this.getBeroHeight()==3) {
			this.setPrice(5000);
		}else if(this.getBeroHeight()==5) {
			this.setPrice(8000);
		}else if(this.getBeroHeight()==7) {
			this.setPrice(10000);
		}
	}

}
