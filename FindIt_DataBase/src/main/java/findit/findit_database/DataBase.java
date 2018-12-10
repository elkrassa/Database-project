package findit.findit_database;

import java.util.LinkedList;
import java.util.Scanner;
//import java.io.DataInputStream;

public class DataBase {

    public static void main(String [] args) {

		LinkedList<LinkedList<Element>> Lista = new LinkedList<>(); //δημιουργία της λίστας.

		System.out.println(" ~~Welcome to your Data Base!~~ \n");
		menu();


		Scanner  scan = new Scanner(System.in, "UTF-8");
		int choice = scan.nextInt();


		choiceResult(choice, Lista);
		while (continue1().equals("Yes")) { //κάθε φορά που ο χρήστης απαντάει θετικα στην μέθοδο Continue, θα εμφανίζεται το μενού και θα ζητέιται η απάντηση απο την αρχη.

            System.out.println("\n");
			menu();

            choice = scan.nextInt();
		    choiceResult(choice, Lista);

		}

	}

	public static void menu() { //δημιουργεί το αρχικό μενού

		System.out.println("Enter your choice: ");
		System.out.println("1 to insert an element into the list.");
		System.out.println("2 to delete an element from the list.");
		System.out.println("3 to edit an element from the list.");
		System.out.println("4 to display all the elements of the list.");
		System.out.println("5 to exit.");

	}

	public static void choiceResult(int choice, LinkedList<LinkedList<Element>> Lista) { //ανάλογα με την απάντηση βρίσκει ποια λειτουργεία πρέπει να πραγματοποιηθεί.

		switch (choice) {

                    case 1: Lista.add(ElementInsertion.insert());
		    break;

                    case 2: ElementErasure.Delete(Lista);
		    break;
		    
                    /*case 3: EditElement.Edit();
		    break;*/

		    case 4: if (Lista == null) {
                        System.out.println("Your data-base is empty.");
			} else {
			    for(int y = 0; y < Lista.size(); y++) {
                                System.out.println(Lista.get(y));
                                System.out.println("\n");
			    }

			}
                }
        }

	public static String continue1() {  //ελεγχει αν ο χρήστης θέλει να συνεχίσει να βρίσκεται στην βάση δεδομένων.

		Scanner scan = new Scanner(System.in, "UTF-8");

		System.out.println("Do you want to continue? (Yes or No)");
		String option = scan.nextLine();

		return option;

	}



}
