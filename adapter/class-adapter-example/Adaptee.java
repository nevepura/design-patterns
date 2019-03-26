public class Adaptee{
	private String first;
	private String second;

	public String getFirst(){
		return first;
	}

	public String getSecond(){
		return second;
	}


	public Adaptee(String f, String s){
		first = f;
		second = s;

	}

	public Adaptee(){
		this("mario", "luigi");
	}

}