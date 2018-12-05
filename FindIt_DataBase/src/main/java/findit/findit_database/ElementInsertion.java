
package findit.findit_database;

import java.util.Scanner;
import java.util.LinkedList;

public class ElementInsertion {
    
    /**
     *
     * @return
     */
    public static LinkedList<Element> insert() {

		Scanner scan = new Scanner(System.in);
		String k = "Yes";

		LinkedList<Element> list = new LinkedList<>();

		while (k.equals("Yes")) {

		   System.out.println("Please insert the name of the new element.");
		   String name = scan.nextLine();
		   System.out.println("Please insert the content of your new element.");
		   String content = scan.nextLine();
		   Element element = new Element(name , content);

		   list.add(element);

		   System.out.println("Do you want to insert another element? (Yes or No)");
		   k = scan.nextLine();
	   }

	   return list;


	}
    
    
}
