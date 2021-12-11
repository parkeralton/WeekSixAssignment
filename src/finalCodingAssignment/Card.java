package finalCodingAssignment;

public class Card {

	private int value; //Value of the card 2-14 with 14=Ace, 13=King, 12=Queen, 11=Jack
	private String name; //The full name of the card
	

//describes a card
	public void describe() {
		System.out.println(name);
	}
	
//getters and setters and the toString method for class
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Card [value=" + value + ", name=" + name + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
