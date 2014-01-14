import java.util.ArrayList;

public class ArtificialIntelligence {
	protected ArrayList<Monster> listMonster;
	
	public ArtificialIntelligence() {
		listMonster = new ArrayList<Monster>();
	}
	
	public void updatePosition() {
		
	}
	
	public Monster checkMonsterInRoom(int x, int y) {
		for(Monster m : listMonster) {
			if(m.getX() == x && m.getY() == y) {
				
			}
		}
		return null;
	}
	
	public void stateMonster() {
		
	}
}
