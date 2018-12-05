package findit.findit_database;

import java.util.Scanner;
import java.util.LinkedList;

public class ElementInsertion {

    public static LinkedList<Element> insert() {

		Scanner scan = new Scanner(System.in);
		String k = "Yes";

		LinkedList<Element> list = new LinkedList<>();

		//System.out.println("Ονομα Επαφης :");


		String name1 = "Οnoma epafis";
		System.out.println("dwse onoma epafis:");
		String content1 = scan.nextLine();
		Element element1 = new Element(name1 , content1);
		list.add(element1);

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