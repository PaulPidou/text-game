import java.util.ArrayList;

public class ArtificialIntelligence {
	protected ArrayList<Monster> listMonster;
	
	public ArtificialIntelligence() {
		listMonster = new ArrayList<Monster>();
		initialzeMonsters();
	}
	
	public void initialzeMonsters() {
		//add Items to the Monsters of the game here
	}
	
	public void updatePosition() {
		//use the method Move of the class Alive
	}
	
	public Monster checkMonsterInRoom(int x, int y) {
		for(Monster m : listMonster) {
			if(m.getX() == x && m.getY() == y)
				return m;
		}
		return null;
	}
	
	public void killMonster(Monster monster) {
		this.listMonster.remove(monster);
	}
}
