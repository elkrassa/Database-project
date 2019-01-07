package findit.findit_database;

/**
 * The Element class is used to create an element with matching number, name and
 * content.
 * <p>
 * This element is used in class Database in order to store new data.
 * 
 * 
 * @author Vakalopoulou Lydia (8170010)
 *          Danalis Petros (8170023)
 *          Daskalakis Alexandros (8170024)
 *          Krassa Eleftheria (8170049)
 *          Mpalomatini Loukia (8170079)
 *          Sourmpati Konstantina-Maria(8170120)
 * @version 1.0
 * @since 2019-01-09
 *           
 */

public class Element {

	private int number;
	private String name;
	private String content;
     
        /**
         * This is the constructor of the element.
         * @param number This is the first parametre on constructor Element.
         * @param name This is the second parametre on constructor Element.
         * @param content This is the third parametre on constructor Element.
         */
	public Element(int number, String name, String content) {

		this.number = number;
		this.name = name;
		this.content = content;
	}
        
        
        /**
         * This method is used to store the elements of the new data in a 
         * specific way.
         * @return String This returns the elements of the new data.
         */
	public String toString() {
		return this.number + ") " + this.name + " : " + this.content;
	}

        /**
         * This is the get method for parametre "number".
         * @return int This returns the value of "number".
         */
	public int getNumber() {

		return number;
	}
        
        /**
         * This is the get method for parametre "name".
         * @return String This returns the value of "name".
         */
	public String getName() {

		return name;

	}
        
        /**
         * This is the get method for parametre "content".
         * @return String This returns the value of "content".
         */
	public String getContent() {

		return content;

	}

        /**
         * This is the set method for parametre "number".
         * @param number This is the first parametre to setNumber method.
         */
	public void setNumber(int number) {

		this.number = number;
	}

        /**
         * This is the set method for parametre "name".
         * @param name This is the first parametre to setNumber method.
         */
	public void setName(String name) {

		this.name = name;

	}

        /**
         * This is the set method for parametre "content".
         * @param content This is the first parametre to setNumber method.
         */
	public void setContent(String content) {

		this.content = content;

	}

}
