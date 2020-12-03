package pharmacy_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	//Method Choose
	 static void choose(){
	
		System.out.println("1-Drugs");
		System.out.println("2-Customers");
		System.out.println("3-Pharmacist");
		System.out.println("4-Search");
		System.out.println("Choose a number : ");
		
	}

	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<Drug> drugsList = new ArrayList<Drug>();
		ArrayList<Customer> customersList = new ArrayList<Customer>();
		ArrayList<Pharmacist> PharmacistList = new ArrayList<Pharmacist>();
		
		//scanner
		Scanner scanne = new Scanner(System.in);		
		Scanner scanne2 = new Scanner(System.in);
		
		
		choose();
		drugsList.add(new Drug(1,"iuui", "34 dhs"));
		
		while(true) {
			//Next CharAt 0
			
			switch(scanne.next().charAt(0)) {
			
			//case 1 drugs Setting
			case '1':
				System.out.println("========================");
				System.out.println("=> Add new Drugs (a)");
				//if the Drugs list is empty 
				if(drugsList.size()>=1) {
					System.out.println("=> Show All Drugs (s)");
					System.out.println("=> Edit Drugs (e)");
					System.out.println("=> Delete Drugs (d)");
				}
				System.out.println("========================");
				switch(scanne.next().charAt(0)) {
				
				case 'a':
					System.out.println("**********************");
					System.out.println("Enter Drug Id :");
					long id = scanne.nextLong();
					System.out.println("Enter Describe :");
					String describe = scanne2.nextLine();
					System.out.println("Enter Price :");
					String price = scanne2.nextLine();
					System.out.println("**********************");
					
					drugsList.add(new Drug(id,describe, price));
					choose();
				break;
				
				case 's':
					System.out.println(drugsList);
					choose();
				break;
				
				case 'e':
					System.out.println("**********************");
					System.out.println("Choose the index you want to Edit :");
					long inEdit = scanne.nextInt();
					System.out.println("Edit Drug Id :");
					long idE = scanne.nextLong();
					System.out.println("Edit Describe :");
					String describeE = scanne2.nextLine();
					System.out.println("Edit Price :");
					String priceE = scanne2.nextLine();
					System.out.println("The drug has been successfully Updated");
					System.out.println("**********************");
					drugsList.set((int) (inEdit-1),new Drug(idE,describeE, priceE));
					choose();
				
				break;
				
				case 'd':
					System.out.println("**********************");
					System.out.println("Choose the index you want to Delete :");
					int inDelete = scanne.nextInt();
					drugsList.remove(inDelete-1);
					System.out.println("The drug has been successfully Deleted");
					System.out.println("**********************");
					choose();
				break;
				
				}
				
			case '2':
			break;
			
			case '3':
			case '4':
			case '5':
			}
		}

	}

}
