import java.util.ArrayList;

public class ArtificialIntelligence {
	protected ArrayList<Monster> listMonster;
	
	public ArtificialIntelligence() {
		listMonster = new ArrayList<Monster>();
		initialzeMonsters();
	}
	
	public void initialzeMonsters() {
		
	}
	
	public void updatePosition() {
		
	}
	
	public Monster checkMonsterInRoom(int x, int y) {
		for(Monster m : listMonster) {
			if(m.getX() == x && m.getY() == y)
				return m;
		}
		return null;
	}
}
