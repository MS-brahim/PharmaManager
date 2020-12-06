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
		@SuppressWarnings("resource")
		Scanner scanne = new Scanner(System.in);		
		@SuppressWarnings("resource")
		Scanner scanne2 = new Scanner(System.in);
		
		
		
		choose();
		
		while(true) {
			//Next CharAt 0
			
			switch(scanne.nextInt()) {
			
			//case 1 drugs Setting
			case 1:
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
					System.out.println("Enter Name :");
					String name = scanne2.nextLine();
					System.out.println("Enter Describe :");
					String describe = scanne2.nextLine();
					System.out.println("Enter Price :");
					String price = scanne2.nextLine();
					System.out.println("**********************");
					
					drugsList.add(new Drug(id,name,describe, price));
					choose();
				break;
				
				case 's':
					System.out.println("____________________________________________________");
					System.out.println(drugsList);
					System.out.println("____________________________________________________");
					choose();
				break;
				
				case 'e':
					System.out.println("**********************");
					System.out.println("Choose the index you want to Edit :");
					long inEdit = scanne.nextInt();
					System.out.println("Edit Drug Id :");
					long idE = scanne.nextLong();
					System.out.println("Edit Name :");
					String nameE = scanne2.nextLine();
					System.out.println("Edit Describe :");
					String describeE = scanne2.nextLine();
					System.out.println("Edit Price :");
					String priceE = scanne2.nextLine();
					
					System.out.println("The drug has been successfully Updated");
					System.out.println("**********************");
					
					drugsList.set((int) (inEdit-1),new Drug(idE,nameE,describeE, priceE));
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
			break;	
			case 2:
				System.out.println("========================");
				System.out.println("=> Add new Customer (a)");
				//if the Customers list is empty 
				if(customersList.size()>=1) {
					System.out.println("=> Show All Customers (s)");
					System.out.println("=> Edit Customers (e)");
					System.out.println("=> Delete Customers (d)");
				}
				System.out.println("========================");
				switch(scanne.next().charAt(0)) {
				
				case 'a':
					System.out.println("**********************");
					System.out.println("Enter Customer Id :");
					long id = scanne.nextLong();
					System.out.println("Enter Firstname :");
					String fname = scanne2.nextLine();
					System.out.println("Enter Lastname :");
					String lname = scanne2.nextLine();
					System.out.println("Enter Phone :");
					String phone = scanne2.nextLine();
					System.out.println("Enter Email :");
					String email = scanne2.nextLine();
					System.out.println("Enter Badge :");
					long badge = scanne.nextInt();
					System.out.println("**********************");
					
					customersList.add(new Customer(id,fname, lname,phone,email,badge));
					choose();
					
				break;
				case 's':
					System.out.println("____________________________________________________");
					System.out.println(customersList);	
					
					// Loyal Customer
					for(Customer lc : customersList) {
			            if (lc.getBadge()>=3) {
			            	System.out.println("_________________________________");
			            	System.out.println("---------------------");
					        System.out.println("Loyal Customer : ");					        
			            	System.out.println(lc);
			            	System.out.println("_________________________________");
			            	break;
			            }
			        }	   
					
					System.out.println("____________________________________________________");
					choose();
				break;
				
				case 'e':
					System.out.println("Choose the index you want to Edit :");
					long inEdit = scanne.nextInt();
					System.out.println("**********************");
					System.out.println("Edit Customer Id :");
					long id1 = scanne.nextLong();
					System.out.println("Edit Firstname :");
					String fname1 = scanne2.nextLine();
					System.out.println("Edit Lastname :");
					String lname1 = scanne2.nextLine();
					System.out.println("Edit Phone :");
					String phone1 = scanne2.nextLine();
					System.out.println("Edit Email :");
					String email1 = scanne2.nextLine();
					System.out.println("Edit Badge :");
					long badge1 = scanne.nextInt();
					
					System.out.println("The Customer has been successfully Updated");
					System.out.println("**********************");
		
					customersList.set((int) (inEdit-1),new Customer(id1,fname1, lname1,phone1,email1,badge1));
					choose();
				
				break;
				
				case 'd':
					System.out.println("**********************");
					System.out.println("Choose the index you want to Delete :");
					int inDelete = scanne.nextInt();
					customersList.remove(inDelete-1);
					
					System.out.println("The drug has been successfully Deleted");
					System.out.println("**********************");
					choose();
				break;
				}
				
			break;
			case 3:
				System.out.println("========================");
				System.out.println("=> Add new Pharmacist (a)");
				//if the Drugs list is empty 
				if(PharmacistList.size()>=1) {
					System.out.println("=> Show All Pharmacist (s)");
					System.out.println("=> Edit Pharmacist (e)");
					System.out.println("=> Delete Pharmacist (d)");
				}
				System.out.println("========================");
				switch(scanne.next().charAt(0)) {
				
				case 'a':
					System.out.println("**********************");
					System.out.println("Enter Pharmacist Id :");
					long id = scanne.nextLong();
					System.out.println("Enter Firstname :");
					String fname = scanne2.nextLine();
					System.out.println("Enter Lastname :");
					String lname = scanne2.nextLine();
					System.out.println("Enter Phone :");
					String phone = scanne2.nextLine();
					System.out.println("Enter Email :");
					String email = scanne2.nextLine();
					System.out.println("**********************");
					
					PharmacistList.add(new Pharmacist(id,fname, lname,phone,email));
					choose();
				break;
				case 's':
					System.out.println("____________________________________________________");
					System.out.println(PharmacistList);
					System.out.println("____________________________________________________");
					choose();
				break;
				
				case 'e':
					System.out.println("Choose the index you want to Edit :");
					long inEdit = scanne.nextInt();
					System.out.println("**********************");
					System.out.println("Edit Pharmacist Id :");
					long id1 = scanne.nextLong();
					System.out.println("Edit Firstname :");
					String fname1 = scanne2.nextLine();
					System.out.println("Edit Lastname :");
					String lname1 = scanne2.nextLine();
					System.out.println("Edit Phone :");
					String phone1 = scanne2.nextLine();
					System.out.println("Edit Email :");
					String email1 = scanne2.nextLine();
				
					System.out.println("The Pharmacist has been successfully Updated");
					System.out.println("**********************");
					
					PharmacistList.set((int) (inEdit-1),new Pharmacist(id1,fname1, lname1,phone1,email1));
					choose();
				
				break;
				
				case 'd':
					System.out.println("***********************");
					System.out.println("Choose the index you want to Delete :");
					int inDelete = scanne.nextInt();
					PharmacistList.remove(inDelete-1);
					
					System.out.println("The drug has been successfully Deleted");
					System.out.println("**********************");
					choose();
				break;
				}
			break;
			case 4:
				System.out.println("Search your Drugs");
				String search = scanne2.nextLine();

		        for(Drug result : drugsList) {
		            if (result.getName().equals(search)) {
		            	System.out.println("_________________________________");
		            	System.out.println("---------------------");
				        System.out.println("Search result v_v");
				        System.out.println("---------------------");
				        
		            	System.out.println(result);
		            	System.out.println("_________________________________");
		            	break;
		            }
		            	System.out.println("An item was not found here ... !");
		            break;
		        }	          
             break;
            
			}
		}
	}

}
