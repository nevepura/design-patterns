public abstract class Fashion{
	public abstract void createHat();
	public abstract void createFootwear();
	
	protected Hat h;
	protected Footwear f;
	

	public Fashion(){
		createHat();
		createFootwear();
	}

	public Hat getHat(){return h;}
	public Footwear getFootwear(){return f;}
}