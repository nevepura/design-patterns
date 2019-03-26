public abstract class Class{
	protected Clothes clo;
	protected Weapon wea;
	protected String className;

	public Class(){
		createClothes();
		createWeapon();
	}


	public abstract void createClothes();
	public abstract void createWeapon();


	public void printAll(){
		System.out.println("Class: " + className + "\nClothes: " +  clo.getClothes() + "\nWeapon: " +  wea.getWeapon() + '\n');
		
	}

}