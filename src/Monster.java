import java.util.ArrayList;

public final class Monster extends Fighter implements haveItems {

	protected ArrayList<Item> listItems;
	
	Monster(String name, String description, int healthPoints, int strength) {
		super(name, description, healthPoints, strength);
		this.listItems = new ArrayList<Item>();
	}
	
	public Item getByName(String name) {
		for(Item i : listItems) {
			if(name == i.name)
				return i;
		}
		return null;
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
		this.listItems.clear();
	}

}
