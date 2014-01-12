
public abstract class Fighter extends Alive {

	protected int healthPoints;
	protected int strength;
	protected boolean alive;
	
	Fighter(String name, String description, int healthPoints, int strength) {
		super(name, description);
		this.healthPoints = healthPoints;
		this.strength = strength;
		this.alive = true;
	}
	
	public int getHealth() {
		return this.healthPoints;
	}
	
	public boolean isAlive() {
		return this.alive;
	}
	
	public void hit(Fighter enemy) {
		enemy.receiveDmage(this.strength);
	}
	
	public void receiveDmage(int damage) {
		this.healthPoints -= damage;
		if(this.healthPoints <= 0) {
			this.healthPoints = 0;
			this.alive = false;
		}
	}

}
