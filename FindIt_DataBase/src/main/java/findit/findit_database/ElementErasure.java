
package findit.findit_database;

import java.util.Scanner;
import java.util.LinkedList;

public class ElementErasure {
    
    public static LinkedList<Element> edit(LinkedList<Element> list) {

	    int length = list.size();

	    Scanner scan = new Scanner(System.in);

	    int element;

	    do {

		    System.out.println("Which element do you want to delete?\n");
		    element = scan.nextInt();

		    if (element > length || element < 0) {

		    System.out.println("There is no element there.Try again");

            }
	    } while (element > length || element < 0);

        list.remove(element);
        System.out.println("Element deleted succesfully!");

        return list;

	}
    
    
}
