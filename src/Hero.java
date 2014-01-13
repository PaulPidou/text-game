
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
		//remove Item of the current Room
		this.inventory.addItem(item);
	}
	
	public void drop(Item item) {
		//add Item to the current Room
		this.inventory.removeItem(item);
	}
	
	public void seeInventory() {
		this.inventory.displayItems();
	}
}
