package findit.findit_database;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.PrintWriter;  
import java.io.File;		
import java.io.FileNotFoundException;  
import java.io.UnsupportedEncodingException; 

public class DataBase {

    public static void main(String [] args) {
        
        int k=1;

		LinkedList<LinkedList<Element>> Lista = new LinkedList<LinkedList<Element>>(); 

		System.out.println(" ~~Welcome to your Data Base!~~ \n");
		menu();
                
                do {

        try {
		    Scanner  scan = new Scanner(System.in, "UTF-8");

		    int choice = scan.nextInt();

		    choiceResult(choice, Lista);
		    while (continue1().equals("Yes")) {

                System.out.println("\n");
		     	menu();

                choice = scan.nextInt();
	            choiceResult(choice, Lista);
                k=1;
		}
		} catch (InputMismatchException e) {
	         System.err.println("Your choice is invalid.");
		     System.out.println("try again." );
                     k=0;

		}
            
                }while (k==0) ;

	}

	public static void menu() {

		System.out.println("Enter your choice: ");
		System.out.println("1 to insert an element into the list.");
		System.out.println("2 to delete an element from the list.");
		System.out.println("3 to edit an element from the list.");
		System.out.println("4 to display all the elements of the list.");
                System.out.println("5 to save in file");
		System.out.println("6 to exit.");

	}

	public static void choiceResult(int choice, LinkedList<LinkedList<Element>> Lista) { 



		switch (choice) {

            case 1: Lista.add(ElementInsertion.insert());
				break;

            case 2: ElementErasure.delete(Lista);
				break;

            case 3: ElementEditing.editList(Lista);
		        break;

	    case 4: if (Lista == null) {
                System.out.println("Your data-base is empty.");
	        } else {
		    for(int y = 0; y < Lista.size(); y++) {
                    System.out.println(y+1);
                    System.out.println(Lista.get(y));
                    System.out.println("\n");
		    }

		}
		break;
                
             case 5:  try 
		{
		File yourDataBase = new File("C:/Users/Desktop/DATABASE/yourDataBase.txt");
		PrintWriter writer = new PrintWriter("yourDataBase.txt", "UTF-8");
		for(int y = 0; y < Lista.size(); y++) {
			writer.println(Lista.get(y));
		}
			writer.close();
			System.out.println("File Saved!");
		}
		catch (FileNotFoundException | UnsupportedEncodingException ex)
		{ ; }
             break;
             
	    case 6 : System.exit(0);
             default :
                      System.out.println("Invalid Entry,please try again");
                      break;

                }
        }

	public static String continue1() {  

		Scanner scan = new Scanner(System.in, "UTF-8");

		System.out.println("Do you want to continue? (Yes or No)");
                int a = 0;
                String option = scan.nextLine();
                while (a==0) {
                if(!"Yes".equals(option) && !"No".equals(option)){
                    System.out.println("Invalid entry,Please try again");
                    option = scan.nextLine();
                    
                } else if ("Yes".equals(option) || "No".equals(option)) {
                    a=1;
                }
               }
		return option;
	}



}
