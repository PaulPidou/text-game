import java.util.ArrayList;

/*
 * Actions that the Hero can do
 */
public class Action {
    
	public void pickUp(String name, Game game) {
    	Room tempRoom = game.getCurrentRoom(game.getHero());
    	Item tempItem = tempRoom.getByName(name);
    	boolean place = game.getHero().addItem(tempItem);
    	if(place) // If the inventory of the Hero is already full
    		tempRoom.removeItem(tempItem);
    }
	
    public void pickUpWeapon(String name, Game game) {
    	Room tempRoom = game.getCurrentRoom(game.getHero());
    	Item tempItem = tempRoom.getByName(name);
    	if(tempItem instanceof Weapon) {
    		Weapon tempWeapon = game.getHero().getWeapon();
    		game.getHero().chooseWeapon((Weapon)tempItem);
    		tempRoom.removeItem(tempItem);
    		tempRoom.addItem(tempWeapon);
    	}
    	else
    		System.out.println("It is not a Weapon");	
    }
    
    public void dropItem(String name, Game game) {
    	Room tempRoom = game.getCurrentRoom(game.getHero());
    	Item tempItem = game.getHero().getInventory().getByName(name);
    	tempRoom.addItem(tempItem);
    	game.getHero().removeItem(tempItem);
    }
}
