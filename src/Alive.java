public class Alive extends Displayable {
		
	protected int coordX, coordY;
	
	Alive(String name, String description) {
		super(name, description);
		this.setXY(0, 0);
	}
	
    public void setXY(int x, int y) {
        this.coordX = x;
        this.coordY = y;
    }
    
    public int getX() {
    	return coordX;
    }

    public int getY() {
    	return coordY;
    }
    
	public void move(int x, int y) {
		this.coordX += x;
		this.coordY += y;
	}

}
