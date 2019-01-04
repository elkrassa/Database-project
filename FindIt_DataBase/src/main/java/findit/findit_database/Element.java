package findit.findit_database;

public class Element {

	private int number;
    private String name;
	private String content;

	public Element(int number, String name, String content) {

		this.number = number;
		this.name = name;
		this.content = content;

	}
	public String toString() {
		return  this.number+ ") " + this.name + " : " + this.content;
	}
	public int getNumber() {

		return number;
	}

	public String getName() {

		return name;

	}

	public String getContent() {

		return content;

	}
	public void setNumber(int number) {

		this.number = number;
	}

	public void setName(String name) {

		this.name = name;

	}

	public void setContent(String content) {

		this.content = content;

	}

}