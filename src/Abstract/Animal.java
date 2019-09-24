package Abstract;

public abstract class Animal {
	private String type;
	private String cry;
	public Animal() {
		super();
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCry() {
		return cry;
	}
	public void setCry(String cry) {
		this.cry = cry;
	}
	public Animal(String type, String cry) {
		super();
		this.type = type;
		this.cry = cry;
	}
	public abstract void eat();
	public void call() {
		
	}

}
