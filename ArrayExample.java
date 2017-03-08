import java.util.ArrayList;
import java.util.Scanner;


public class ArrayExample {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		ArrayList<Student> myList = new ArrayList<Student>();
		
		for(int i = 1; i<=2; i++)
		{
		System.out.println("Enter Id: ");
		int id = input.nextInt();
		System.out.println("Enter Name: ");
		String name = input2.nextLine();
		System.out.println("Enter First Subject Marks");
		double first = input.nextDouble();
		System.out.println("Enter Second Subject Marks");
		double second = input.nextDouble();
		System.out.println("Enter Third Subject Marks");
		double third = input.nextDouble();
		
		
		
		
		myList.add(new Student(id, name, first, second, third));
		}
		
		/*myList.add(new Student(2, "Sadhan", 80.0, 70.0, 90.0));
		myList.add(new Student(3, "Shimul", 60.0, 70.0, 80.0));
		myList.add(new Student(4, "Yusuf", 80.0, 70.0, 90.0));
		myList.add(new Student(5, "Mim", 60.0, 70.0, 80.0));*/
		
		for(Object j:myList)
		{
			System.out.println(j);
		}
		
		/*System.out.println(myList.get(1));
		System.out.println(myList.get(2));
		System.out.println(myList.get(3));
		System.out.println(myList.get(4));*/
		
	}
}
