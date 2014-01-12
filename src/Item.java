
public abstract class Item extends Displayable{

	protected int weight;
	
	Item(String name, String description, int weight) {
		super(name, description);
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
}
