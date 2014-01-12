import java.util.ArrayList;

public class Inventory extends Item {
	
	protected int size;
	protected ArrayList<Item> listItems;
	
	Inventory(String name, String description, int weight, int size) {
		super(name, description, weight);
		this.size = size;
		this.listItems = new ArrayList<Item>();
	}
	
	public int getSize() {
		return this.size;
	}
	
	public int getPlaceLeft() {
		int placeTaken = 0;
		for(Item i : listItems) {
			placeTaken += i.weight;
		}
		return size - placeTaken;
	}
	
	public boolean isPlaceLeft() {
		if(this.getPlaceLeft() <= 0)
			return false;
		else
			return true;
	}
	
	public void addItem(Item item) {
		if(this.getPlaceLeft() >= item.weight) {
			listItems.add(item);
		}
		else
			System.out.println("Not enough place in the inventory !");
	}
	
	public void displayItems() {
		System.out.println("Inventory :");
		for(Item i : listItems) {
			System.out.println(i);
		}
	}

}
