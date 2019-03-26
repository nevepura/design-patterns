// adaptee
public class Rectangle{
	private float topLeft;
	private float bottomRight;

	public float getTopLeft(){
		return topLeft;
	}

	public float getBottomLRight(){
		return bottomRight;
	}

	public Rectangle(float tl, float br){
		topLeft = tl;
		bottomRight = br;
	}

	public Rectangle(){
		this(0,0);
	}
	
}