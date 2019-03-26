// Adapter ridefinisce i due metodi astratti di Base usando Adaptee. 

public class Adapter extends Adaptee implements Base{
	public String[] myStrings(){
		return new String[]{
			getFirst(), getSecond()
		};
	}

	public void printStrings(){
		String[] tmp = myStrings();
		for (int i = 0; i<tmp.length; i++){
			System.out.println(tmp[i]);
		}
	}

	public Adapter(String a, String b){
		super(a,b);
	}
	public Adapter(){
		super();
	}
}