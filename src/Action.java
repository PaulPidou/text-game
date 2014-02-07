import java.util.ArrayList;

/*
 * Actions that the Hero can do
 */
public class Action {
    
    public static void pickUp(String name, Game game) {
    	Room tempRoom = game.getCurrentRoom(game.getHero());
    	Item tempItem = tempRoom.getByName(name);
    	boolean place = game.getHero().addItem(tempItem);
    	if(place) // If the inventory of the Hero is already full
    		tempRoom.removeItem(tempItem);
    }
    
    public static void dropItem(String name, Game game) {
    	Room tempRoom = game.getCurrentRoom(game.getHero());
    	Item tempItem = game.getHero().getInventory().getByName(name);
    	tempRoom.addItem(tempItem);
    	game.getHero().removeItem(tempItem);
    }
}
