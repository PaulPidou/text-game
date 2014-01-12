
public final class Hero extends Fighter {

	protected Weapon mainWeapon;
	protected Inventory inventory;
	
	Hero(String name, String description, int healthPoints, int strength) {
		super(name, description, healthPoints, strength);
		this.mainWeapon = null;
	}
	
	Hero(String name, String description, int healthPoints, int strength, Weapon weapon) {
		super(name, description, healthPoints, strength);
		this.mainWeapon = weapon;
		this.setStrength();
	}
	
	public void setStrength() {
		this.strength = mainWeapon.damage;
	}
	
	public void pickUp(Item item) {
		this.inventory.addItem(item);
	}
	
	public void seeInventory() {
		this.inventory.displayItems();
	}

}
