public class FightSystem {
	
    /**
     * @return The winner of the fight
     */
	public Fighter Fight(Fighter fighter1, Fighter fighter2) {
		while(fighter1.isAlive() && fighter2.isAlive()) {
			fighter1.hit(fighter2);
			if(fighter2.isAlive())
				fighter2.hit(fighter1);
		}
		
		if(fighter1.isAlive())
			return fighter1;
		else
			return fighter2;
	}
}
