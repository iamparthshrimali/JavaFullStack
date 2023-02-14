package day6.ex2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static void printTeams(ArrayList<String> teams)
	{
		for(String team:teams)
			System.out.println(team);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter teams name:");
		ArrayList<String> teams=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			String name=sc.nextLine();
			teams.add(name);
		}
		
		printTeams(teams);
		
		System.out.println("Enter first position to swap: ");
		int firstPosition=sc.nextInt();
		System.out.println("Enter second position to swap");
		int secondPosition=sc.nextInt();
		
		Collections.swap(teams, firstPosition, secondPosition);
		printTeams(teams);

	}

}
