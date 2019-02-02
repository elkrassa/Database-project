package findit.findit_database;

/**
 * The ElementEditing class is used to edit an already exstened element from the
 * dabase.
 * <p>
 * This class is used in class Database in order to edit the data.
 *
 *
 * @author Vakalopoulou Lydia (8170010)
 *         Danalis Petros (8170023)
 *         Daskalakis Alexandros (8170024)
 *         Krassa Eleftheria (8170049)
 *         Mpalomatini Loukia (8170079)
 *         Sourmpati Maria - Konstantina(8170120)
 * @version 1.0
 * @since 2019-01-09
 *
 */

import java.util.Scanner;
import java.util.LinkedList;


public class ElementEditing {

    /**
    * This method gets the number of the data the user wants to edit and
    * executes equivalents functions.
    * @param list This is the first parametre to editList method
    * @return LinkedList<LinkedList<Element>> This returns the up-to-date
    * list.
    */
    public static LinkedList<LinkedList<Element>> editList(LinkedList<LinkedList<Element>> list) {
		int length = list.size();
		        Scanner scan = new Scanner(System.in);
		        int epafi;

		        do {
					System.out.println("Choose the exact number of the insertion you want to change\n");
					System.out.println("(Choose between "+length+" insertions)");
					epafi=scan.nextInt();
					epafi=epafi-1;
					if (epafi > length || epafi < 0) {
						System.out.println("There is no such an insertion\n");
					}
		        } while (epafi > length || epafi < 0);
		        LinkedList<Element> ep = list.get(epafi);
		        int sizee = ep.size();
		        int thesi;

		        do {
					System.out.printf("In insertion %d  which element do you want to change?\n",epafi+1);
					System.out.printf("(Choose between elements :");
					for(int i=1; i<sizee+1; i++) {
						System.out.print(i);
						if(i<sizee){
						System.out.print(" or ");
						}
						else{
						System.out.println(" )");
						}
					}
					thesi = scan.nextInt();
					if (thesi > sizee || thesi < 0) {
						System.out.println("There is no such an element\n");
					}
				} while (thesi > sizee || thesi < 0);

		       	Element name1 = ep.get(thesi-1);

		        String nam = name1.getName();
		        String con = name1.getContent();
		        System.out.println("Give me new insert for "+nam);
		        Scanner scan1 = new Scanner(System.in);
		        String new_insert;
		        new_insert= scan1.nextLine();
		        name1.setContent(new_insert);


		        System.out.println("Element changed succesfully!");


        return list;
	}
}
