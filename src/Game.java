import java.util.ArrayList;


public abstract class Game {
	protected Hero hero;
	protected ArrayList<Room> listRooms;
	protected Room currentRoom;
	
    public Game() {
    	this.listRooms = new ArrayList<Room>();
    	this.hero = new Hero("Paul", " ", 100, 30);
    }
    
    public Room currentRoom() {
    	for(Room r : listRooms) {
    		if(hero.getX() == r.getX() && hero.getY() == r.getY())
    			return r;
    	}
		return null; 
    }
    
    public void pickUp(String name) {
    	Room tempRoom = currentRoom();
    	Item tempItem = tempRoom.getByName(name);
    	boolean place = this.hero.addItem(tempItem);
    	if(place)
    		tempRoom.removeItem(tempItem);
    }
    
    public void dropItem(String name) {
    	Room tempRoom = currentRoom();
    	Item tempItem = this.hero.getInventory().getByName(name);
    	tempRoom.addItem(tempItem);
    	this.hero.removeItem(tempItem);
    }
}
