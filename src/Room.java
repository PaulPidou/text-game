import java.util.ArrayList;


public class Room extends Displayable {

	protected boolean visited;
	protected int coordX, coordY;
	protected ArrayList<Item> listItems;
	
	Room(String name, String description) {
		super(name, description);
		this.listItems = new ArrayList<Item>();
	}
	
	public void beVisited() {
		this.visited = true;
	}
	
	public boolean isVisited() { 
		return visited;
	}
	
    public void setXY(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }
    
    public int getX() {
    	return coordX;
    }

    public int getY() {
    	return coordY;
    }
    
	public void addItem(Item item) {
		this.listItems.add(item);
	}
	
	public void removeItem(Item item) {
		this.listItems.remove(item);
	}
}
