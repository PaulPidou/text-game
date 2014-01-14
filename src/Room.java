import java.util.ArrayList;


public class Room extends Displayable implements haveItems{

	protected boolean visited;
	protected int coordX, coordY;
	protected ArrayList<Item> listItems;
	
	Room(String name, String description) {
		super(name, description);
		this.listItems = new ArrayList<Item>();
	}
	
	public Item getByName(String name) {
		for(Item i : listItems) {
			if(name == i.name)
				return i;
		}
		return null;	
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
