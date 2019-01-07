package findit.findit_database;

/**
 * The ElementErasure class is used to insert a new "element" object in a 
 * database. It ends when users insert "No" to the final question.
 * <p>
 * This class is used in class Database in order to delete data.
 * 
 * 
 * @author Vakalopoulou Lydia (8170010)
 *          Danalis Petros (8170023)
 *          Daskalakis Alexandros (8170024)
 *          Krassa Eleftheria (8170049)
 *          Mpalomatini Loukia (8170079)
 *          Sourbati Maria-Kwnstantina
 * @version 1.0
 * @since 2019-01-09
 *           
 */

import java.util.Scanner;
import java.util.LinkedList;

public class ElementErasure {

	public static LinkedList<LinkedList<Element>> delete(LinkedList<LinkedList<Element>> list) {
		Scanner scan = new Scanner(System.in, "UTF-8");
		System.out.println(
				"Press 1 if you want to delete an Insertion or press 2 if you want to delete the whole data base"); 
		int choice = scan.nextInt();
		int length = list.size();
		
                switch (choice) { 

		case 1: {
			System.out.println(
                                "Press 1 if you want to delete the whole Insertion or  Press 2 to delete an element of an Insertion");
			int an = scan.nextInt();
			switch (an) {
			case 1: {
				int n;
				do {

					System.out.println("Choose the number of the insertion you want to delete\n");
					n = scan.nextInt();
					n = n - 1;
					if (n > length || n < 0) {
						System.out.println("There is no such insertion\n");
					}
				} while (n > length || n < 0);
				LinkedList<Element> ep = list.get(n);
				list.remove(ep);
				System.out.println("Insertion deleted succesfully");
			}
				break;
			case 2: {

				int n;
				do {

					System.out.println(
							"Where is the element you want to delete? Choose the number of the insertion first\n");
					n = scan.nextInt();
					n = n - 1;
					if (n > length || n < 0) {
						System.out.println("There is no such insertion\n");
					}
				} while (n > length || n < 0);
				LinkedList<Element> ep = list.get(n);
				int thesi = 0;
				int sizee = ep.size();
				do {
					System.out.printf("In insertion %d  which element do you want to delete?\n", n + 1);
					thesi = scan.nextInt();
					if (thesi > sizee || thesi < 0) {
						System.out.println("There is no such element\n");
					}
				} while (thesi > sizee || thesi < 0);
				Element name2 = ep.get(thesi - 1);
				ep.remove(name2);
				System.out.println("Element deleted succesfully");
				for (int y = thesi; y < sizee; y++) {
					Element name1 = ep.get(y - 1);
					int ok = name1.getNumber();
					ok = ok - 1;
					name1.setNumber(ok);
				}

			}
				break;
			}
		}
		break;

		case 2: {

			while (!list.isEmpty()) {
				list.removeFirst();
			}
			System.out.println("Data Base deleted succesfully!");
		}
		break;

		}

		return list;

	}

}
