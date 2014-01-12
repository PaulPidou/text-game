
public class Weapon extends Item {

	protected int damage;
	
	Weapon(String name, String description, int weight, int damage) {
		super(name, description, weight);
		this.damage = damage;
	}
	
	public int getDamage() {
		return this.damage;
	}
}
