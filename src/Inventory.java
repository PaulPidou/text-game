import java.util.ArrayList;

public class Inventory extends Item {
	
	protected int size;
	protected ArrayList<Item> listItems;
	
	Inventory(String name, String description, int weight, int size) {
		super(name, description, weight);
		this.size = size;
		this.listItems = new ArrayList<Item>();
	}
	
	public Item getByName(String name) {
		for(Item i : listItems) {
			if(name == i.name)
				return i;
		}
		return null;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getPlaceTaken() {
		int placeTaken = 0;
		for(Item i : listItems) {
			placeTaken += i.weight;
		}
		return placeTaken;
	}
	
	public int getPlaceLeft() {
		return size - this.getPlaceTaken();
	}
	
	public boolean isPlaceLeft() {
		if(this.getPlaceLeft() <= 0)
			return false;
		else
			return true;
	}
	
	public boolean addItem(Item item) {
		if(this.getPlaceLeft() >= item.weight) {
			listItems.add(item);
			return true;
		}
		else
			System.out.println("Not enough place in the inventory !");
			return false;
	}
	
	public void removeItem(Item item) {
		this.listItems.remove(item);
	}
	
	public Item indexToItem(int index) {
		return this.listItems.get(index);
	}
	
	public void transferItems(Inventory inventory) {
		if(this.getPlaceTaken() <= inventory.size) {
			for(Item i : listItems) {
				inventory.addItem(i);
			}
		}
		else
			System.out.println("The new inventory is too small !");
	}
	
	public void displayItems() {
		int j = 1;
		if(!this.listItems.isEmpty()) {
			System.out.println("There are " + this.listItems.size() + " in the inventory :");
			for(Item i : listItems) {
				System.out.println(j + " - " + i);
				j++;
			}
		}
		else
			System.out.println("There is no item in the inventory !");
	}

}
