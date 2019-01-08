package findit.findit_database;

/**
 * <h1> Data Base! </h1>
 * The DataBase class implements an application that 
 * creates a full-functional database.
 * <p>
 * In this database you can store any kind of data you
 * want!
 * The functions which exececutes are: 
 * -Insert an element into the database.
 * -Delete: A specific content of an element, an element or the whole database.
 * -Edit the content of an element.
 * -Display the whole database.
 * -Save the database in your system.
 * -Exit database.
 * 
 * 
 * 
 * @author Vakalopoulou Lydia (8170010)
 *          Danalis Petros (8170023)
 *          Daskalakis Alexandros (8170024)
 *          Krassa Eleftheria (8170049)
 *          Mpalomatini Loukia (8170079)
 *          Sourmpati Maria - Kwnstantina (8170120)
 * @version 1.0
 * @since 2019-01-09
 *           
 */


import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class DataBase {
    
        /**
         * This is the main method to class DataBase which scan users choice and
         * checks if it is valid or not.
         * @param args This is the firt parametre to main method.
         * @throws FileNotFoundException
         * @see FileNotFoundException
         * @throws UnsupportedEncodingException 
         * @see UnsupportedEncodingException 
         */

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

		int k = 1;

		LinkedList<LinkedList<Element>> Lista = new LinkedList<LinkedList<Element>>();

		System.out.println(" ~~Welcome to your Data Base!~~ \n");
		menu();

		do {

			try {
				Scanner scan = new Scanner(System.in, "UTF-8");

				int choice = scan.nextInt();

				choiceResult(choice, Lista);
				while (continue1().equals("Yes")) {

					System.out.println("\n");
					menu();

					choice = scan.nextInt();
                                        System.out.println("");
					choiceResult(choice, Lista);
					k = 1;
				}
			} catch (InputMismatchException e) {
				System.err.println("Your choice is invalid.");
				System.out.println("try again.");
				k = 0;

			}

		} while (k == 0);

	}

        /**
        * This method displays the main menu of the database.
        */
        
	public static void menu() {

		System.out.println("Enter your choice: ");
		System.out.println("1 to insert an element into the list.");
		System.out.println("2 to delete an element from the list.");
		System.out.println("3 to edit an element from the list.");
		System.out.println("4 to display all the elements of the list.");
		System.out.println("5 to save in file");
		System.out.println("6 to exit.");

	}
      
        /**
        * This method checks the choise of the user and calls the matching
        * class or method for each choice.
        * @param choice This is the first parametre to choiceResult method.
        * @param Lista This is the seconf parametre to choiceResult method.
        * @throws java.io.FileNotFoundException
        * @see java.io.FileNotFoundException
        * @throws java.io.UnsupportedEncodingException
        * @see java.io.UnsupportedEncodingException
        */
	public static void choiceResult(int choice, LinkedList<LinkedList<Element>> Lista) throws FileNotFoundException, UnsupportedEncodingException {
      
		switch (choice) {

		case 1:
			Lista.add(ElementInsertion.insert());
			break;

		case 2:
			ElementErasure.delete(Lista);
			break;

		case 3:
			ElementEditing.editList(Lista);
			break;

		case 4:
			show(Lista);
			break;

		case 5:
			saveFile(Lista);
			break;

		case 6:
			System.exit(0);
		default:
			System.out.println("Invalid Entry,please try again"); //If the choice in not integer [1,6].
			break;

		}
	}
        
        /**
         * This method checks if the list is empty or not and print matching 
         * output
         * @param Lista The is the first parametre to show method.
         */
        public static void show(LinkedList<LinkedList<Element>> Lista) {
            if (Lista == null) {
				System.out.println("Your data-base is empty.");
			} else { //shows the whole database
				for (int y = 0; y < Lista.size(); y++) {
					System.out.println(y + 1);
					System.out.println(Lista.get(y));
					System.out.println("\n");
				}

			}
        }
        
        /**
         * This method checks if the user wants to continue using the database 
         * or not. 
         * @return String This reurns equivalnt message if the user inserts 
         * invalid entry.
         */
	public static String continue1() {

		Scanner scan = new Scanner(System.in, "UTF-8");

		System.out.println("Do you want to continue? (Yes or No)");
		int a = 0;
		String option = scan.nextLine();
		while (a == 0) { //checks if the ansewr is valid ("Yes" or "No").
			if (!"Yes".equals(option) && !"No".equals(option)) {
				System.out.println("Invalid entry,Please try again");
				option = scan.nextLine();

			} else if ("Yes".equals(option) || "No".equals(option)) {
				a = 1;
			}
		}
		return option;
	}
        
        /**
         * This method saves the database in the system.
         * @param Lista This is the firs parametre to saveFile method. 
         * @throws FileNotFoundException
         * @see FileNotFoundException
         * @throws UnsupportedEncodingException 
         * @see UnsupportedEncodingException 
         */
        public static void saveFile(LinkedList<LinkedList<Element>> Lista) throws FileNotFoundException, UnsupportedEncodingException {
            
            try {
				File yourDataBase = new File("C:/Users/Desktop/DATABASE/yourDataBase.txt");
				PrintWriter writer = new PrintWriter("yourDataBase.txt", "UTF-8");
				for (int y = 0; y < Lista.size(); y++) {
					writer.println(Lista.get(y));
				}
				writer.close();
				System.out.println("File Saved!");
			} catch (FileNotFoundException | UnsupportedEncodingException ex) {
				System.out.println("An error occured, please try again!");
			}
        }

}
