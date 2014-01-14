import java.util.ArrayList;

public final class Monster extends Fighter {

	protected ArrayList<Item> listItems;
	
	Monster(String name, String description, int healthPoints, int strength) {
		super(name, description, healthPoints, strength);
		this.listItems = new ArrayList<Item>();
	}
	
	public ArrayList<Item> getItems() {
		return listItems;	
	}
	
	public void addItem(Item item) {
		listItems.add(item);
	}
	
	public void removeItems() {
		this.listItems.clear();
	}

}
