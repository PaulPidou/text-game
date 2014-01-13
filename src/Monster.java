import java.util.ArrayList;

public final class Monster extends Fighter {

	protected ArrayList<Item> listItems;
	
	Monster(String name, String description, int healthPoints, int strength) {
		super(name, description, healthPoints, strength);
		this.listItems = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
			listItems.add(item);
	}
	
	public void receiveDmage(int damage) {
		super.receiveDmage(damage);
		if(!this.isAlive()) {
			this.dropItems();
		}
	}
	
	public void dropItems() {
		//add Items to the current Room
		this.listItems.clear();
	}

}
