package findit.findit_database;
import java.util.Scanner;
import java.util.LinkedList;


public class ElementEditing {
    public static LinkedList<LinkedList<Element>> editList(LinkedList<LinkedList<Element>> list) {
        int length = list.size();
        Scanner scan = new Scanner(System.in);
        int epafi;

        do {
			System.out.println("Choose the exact number of the insertion you want to change:\n");
			epafi=scan.nextInt();
			epafi=epafi-1;
			if (epafi > length || epafi < 0) {
				System.out.println("There is no such insertion.\n");
			}
        } while (epafi > length || epafi < 0);
        LinkedList<Element> ep = list.get(epafi);
        int sizee = ep.size();
        int thesi;

        do {
			System.out.printf("In insertion %d, which element do you want to change?\n",epafi+1);
			thesi = scan.nextInt();
			if (thesi > sizee || thesi < 0) {
				System.out.println("There is no such element.\n");
			}
		} while (thesi > sizee || thesi < 0);

       	Element name1 = ep.get(thesi-1);

        String nam = name1.getName();
        String con = name1.getContent();
        System.out.println("Give me new insert for "+nam+".");
        Scanner scan1 = new Scanner(System.in);
        String new_insert;
        new_insert= scan1.nextLine();
        name1.setContent(new_insert);


        System.out.println("Element changed succesfully!");


        return list;
    }
}