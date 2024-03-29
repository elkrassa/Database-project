package findit.findit_database;

/**
 * The ElementInsertion class is used to insert a new "element" object in a 
 * database. It ends when users insert "No" to the final question.
 * <p>
 * This class is used in class Database in order to insert new data.
 * 
 * 
 * @author Vakalopoulou Lydia (8170010)
 *          Danalis Petros (8170023)
 *          Daskalakis Alexandros (8170024)
 *          Krassa Eleftheria (8170049)
 *          Mpalomatini Loukia (8170079)
 *          Sourmpati Maria - Kwnstantina(8170120)
 * @version 1.0
 * @since 2019-01-09
 *           
 */

import java.util.Scanner;
import java.util.LinkedList;

public class ElementInsertion {

        /**
         * This class gets the name and the content of the new element and stores
         * it to the database.
         * @return LinkedList<Element> This is the list where the new data is 
         * stored.
         */
	public static LinkedList<Element> insert() {

		Scanner scan = new Scanner(System.in, "UTF-8");
		String k = "Yes";

		LinkedList<Element> list = new LinkedList<>();

		int number1 = 1;
		String name1 = "Insertion Name"; 
		System.out.println("Please insert the name of your insertion:");
		String content1 = scan.nextLine();
		Element element1 = new Element(number1, name1, content1);
		list.add(element1);
		int number = 1;

		while (k.equals("Yes")) {
			number = number + 1;
			System.out.println("Please insert the name of the new element.");
			String name = scan.nextLine();
			System.out.println("Please insert the content of your new element.");
			String content = scan.nextLine();
			Element element = new Element(number, name, content);

			list.add(element);

			System.out.println("Do you want to insert another element? (Yes or No)");
			k = scan.nextLine();
			int a = 0;
			while (a == 0) {
				if (!"Yes".equals(k) && !"No".equals(k)) {
					System.out.println("Invalid entry,Please try again");
					k = scan.nextLine();

				} else if ("Yes".equals(k) || "No".equals(k)) {
					a = 1;
				}
			}
		}

		return list;

	}

}
