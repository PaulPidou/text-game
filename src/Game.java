import java.util.ArrayList;


public abstract class Game {
	protected Hero hero;
	protected ArrayList<Room> listRooms;
	protected Room currentRoom;
	protected ArtificialIntelligence Ai;
	protected FightSystem fightSystem;
	
    public Game() {
    	this.listRooms = new ArrayList<Room>();
    	this.hero = new Hero("Paul", " ", 100, 30);
    	Ai = new ArtificialIntelligence();
    	fightSystem = new FightSystem();
    }
    
    public Room getCurrentRoom(Alive alive) {
    	for(Room r : listRooms) {
    		if(alive.getX() == r.getX() && alive.getY() == r.getY())
    			return r;
    	}
		return null; 
    }
    
    public void pickUp(String name) {
    	Room tempRoom = getCurrentRoom(this.hero);
    	Item tempItem = tempRoom.getByName(name);
    	boolean place = this.hero.addItem(tempItem);
    	if(place)
    		tempRoom.removeItem(tempItem);
    }
    
    public void dropItem(String name) {
    	Room tempRoom = getCurrentRoom(this.hero);
    	Item tempItem = this.hero.getInventory().getByName(name);
    	tempRoom.addItem(tempItem);
    	this.hero.removeItem(tempItem);
    }
    
    public void monsterDropItems(Monster monster) {
    	Room tempRoom = getCurrentRoom(monster);
    	ArrayList<Item> tempItems = monster.getItems();
    	for(Item i : tempItems) {
    		tempRoom.addItem(i);
    	}
    	monster.removeItems();
    }
    
    public void checkFight() {
    	Room roomHero = getCurrentRoom(this.hero);
    	Monster monster = Ai.checkMonsterInRoom(roomHero.getX(), roomHero.getY());
    	if(monster != null) {
    		Fighter winner = fightSystem.Fight(this.hero, monster);
    		if(this.hero == winner) {
    			monsterDropItems(monster);
    			Ai.killMonster(monster);
    		}
    		else
    			return; //end of the Game
    	}
    }
}
