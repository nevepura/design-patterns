public class Warrior extends Class{
	public void createClothes(){
		clo = new Armor();
		clo.setClothes();
	}

	public void createWeapon(){
		wea = new Sword();
		wea.setWeapon();
	}
	
	public Warrior(){
		super();
		className = "Warrior";
	}
}