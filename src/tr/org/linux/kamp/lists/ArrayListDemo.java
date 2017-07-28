package tr.org.linux.kamp.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ArrayListDemoObject alistDemo = new ArrayListDemoObject();
		alistDemo.addElement("LKD");
		alistDemo.addElement("2017");
		alistDemo.addElement("Java");
		
		ArrayList<String> list = new ArrayList <String>();
		list.addAll(alistDemo.getListDemo());
		
		//for (String element : list) {
			
			/*System.out.println(element);
			
		}
		
		boolean removeResult = alistDemo.removeElement("Java");
		if(removeResult) {
			System.out.println("Removing is successful.");
			
		}else {
			System.out.println("Removing failed.");
		}
		
		for (String element: list) {
			System.out.println(element);
		}*/
		
		int input = 0;
		Scanner scan = new Scanner(System.in);
		while(input != -1) {
			System.out.println("1- Add element :");
			System.out.println("2- Remove element :");
			System.out.println("3- Check element exist :");
			System.out.println("4- Show size :");
			System.out.println("Enter -1 to exit.");
			input = scan.nextInt();
			
			switch (input) {
			case 1: 
				System.out.println("Enter a string to add to the list: ");
				boolean result = list.add(scan.next());
				if(result) {
					System.out.println("Adding is successful. "+ list.get(list.size()));
				}else {
					System.out.println("Adding failed.");
				}
				break;
				
			case 2:
				System.out.println("Enter a string to remove from the list: ");
				String elementToRemove =scan.next();
				result = list.remove(elementToRemove);
				if(result) {
					System.out.println("Removing is successful. "+ elementToRemove );
				}else {
					System.out.println("Removing element failed. "+ elementToRemove);
				}
				break;
				
			case 3:
				System.out.println("Enter a string to check if it exists in the list. ");
				String elementToCheck = scan.next();
				result= list.contains(elementToCheck);
				if(result) {
					System.out.println("Element exists : "+ elementToCheck);
				}else {
					System.out.println("Element doesn't exists : "+ elementToCheck);
				}
				break;
				
			case 4:
				System.out.println("Size of the list : "+ list.size());
				break;
				
			case -1:
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter a valid value");
				break;
				
			}
		}	
	}
}
