public class ElegantFashion extends Fashion{
	public void createHat(){
		h = new ElegantHat();
	}

	public void createFootwear(){
		f = new ElegantFootwear();
	}
	
	public ElegantFashion(){
		super();
	}
}