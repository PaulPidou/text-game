
public abstract class Displayable {
	protected String name;
	protected String description;
	
	Displayable(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String toString() {
		return name + " - " + description;
	}
}
