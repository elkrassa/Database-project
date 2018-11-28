
package findit.findit_database;

public class Element {
    
    private String name;
	private String content;

	public Element(String name, String content) {

		this.name = name;
		this.content = content;

	}

	public String getName() {

		return name;

	}

	public String getContent() {

		return content;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setContent(String content) {

		this.content = content;

	}
    
}
