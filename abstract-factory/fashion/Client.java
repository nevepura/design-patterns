public class Client{
	public static void main(String args[]){
		
		Fashion ef = new ElegantFashion();
		ef.getFootwear().Info();
		ef.getHat().Info();
		

		Fashion cf = new ComfyFashion();
		cf.getFootwear().Info();
		cf.getHat().Info();
	}
}