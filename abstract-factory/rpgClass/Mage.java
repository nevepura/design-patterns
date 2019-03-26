public class Mage extends Class{
	public void createClothes(){
		clo = new Cape();
		clo.setClothes();
	}

	
	public void createWeapon(){
		wea = new Staff();
		wea.setWeapon();
	}
	
	public Mage(){
		super();
		className = "Mage";
	}
}