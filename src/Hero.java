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
	
	public Inventory getInventory() {
		return this.inventory;
	}
	
	public void setStrength() {
		this.strength = mainWeapon.damage;
	}
	
	public boolean addItem(Item item) {
		return this.inventory.addItem(item);
	}
	
	public void removeItem(Item item) {
		this.inventory.removeItem(item);
	}
	
	public void seeInventory() {
		this.inventory.displayItems();
	}
	
	public Weapon getWeapon() {
		return this.mainWeapon;	
	}
	
	public void chooseWeapon(Weapon weapon) {
		this.mainWeapon = weapon;
	}
}
