public class FightSystem {
	
	public Alive Fight(Fighter fighter1, Fighter fighter2) {
		Alive winner = null;
		
		while(fighter1.isAlive() && fighter2.isAlive()) {
			fighter1.hit(fighter2);
			if(fighter2.isAlive())
				fighter2.hit(fighter1);
			
		}
		
		return winner;
	}
}
