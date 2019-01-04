
package findit.findit_database;

import java.util.Scanner;
import java.util.LinkedList;

public class ElementErasure {
    
    /**
     *
     * @param list
     * @return
     */
    public static LinkedList<LinkedList<Element>> delete(LinkedList<LinkedList<Element>> list) {
		Scanner scan = new Scanner(System.in , "UTF-8");
		System.out.println("Press 1 if you want to delete an element or press 2 if you want to delete the whole data base"); // change
		int choice = scan.nextInt();
		if (choice == 1) { //change
			int length = list.size();
			int element;

	    do {

		    System.out.println("Which element do you want to delete?\n");
		    element = scan.nextInt();

		    if (element > length || element < 0) {

		    System.out.println("There is no element there.Try again");

            }
	    } while (element > length || element < 0);

        list.remove(element - 1); //change
        System.out.println("Element deleted succesfully!"); }
        else if (choice == 2)  { // change
			while (!list.isEmpty()) {
			        list.removeFirst();
				}
			System.out.println("Data Base deleted succesfully!");
    }

        return list;

	}
    
}
