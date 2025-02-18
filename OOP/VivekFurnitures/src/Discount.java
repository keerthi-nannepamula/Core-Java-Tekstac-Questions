
public class Discount {
	
	public double calculateDiscount(Bero bObj) {
		if(bObj instanceof SteelBero) {
			return (bObj.getPrice()*10)/100;
		}else if(bObj instanceof WoodenBero) {
			return (bObj.getPrice()*15)/100;
		}else {
			return 0;		
		}		
	}
}
