import java.util.ArrayList;

public abstract class Game {
	protected Hero hero;
	protected ArrayList<Room> listRooms;
	protected Room currentRoom;
	
	protected ArtificialIntelligence Ai;
	protected FightSystem fightSystem;
	
	protected GameState state;
	
    public Game() {
    	this.listRooms = new ArrayList<Room>();
    	this.hero = new Hero("Paul", " ", 100, 30);
    	
    	Ai = new ArtificialIntelligence();
    	fightSystem = new FightSystem();
    	
    	state = GameState.EXPLORATION;
    }
    
    public GameState getState() {
		return state;
    }
    
    public Hero getHero() {
    	return this.hero;
    }
    
    public Room getCurrentRoom(Alive alive) {
    	for(Room r : listRooms) {
    		if(alive.getX() == r.getX() && alive.getY() == r.getY())
    			return r;
    	}
		return null; 
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
    		state = GameState.FIGHT;
    		/* Fighter winner = fightSystem.Fight(this.hero, monster);
    		if(this.hero == winner) {
    			monsterDropItems(monster);
    			Ai.killMonster(monster);
    		}
    		else
    			return; //end of the Game */
    	}
    }
}
