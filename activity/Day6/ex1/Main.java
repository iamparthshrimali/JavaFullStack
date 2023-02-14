package day6.ex1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void printDetails(ArrayList players)
	{
		System.out.println("Player Details:");
		for(Object player:players)
		{
			System.out.println(player);
		}
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList player=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		String name=sc.nextLine();
		player.add(name);
		System.out.println("Enter age");
		int age=sc.nextInt();
		player.add(age);
		System.out.println("Enter Country");
		sc.nextLine();
		String country=sc.nextLine();
		player.add(country);
		printDetails(player);
		
		System.out.println("Enter Skill");
//		Batsman/Bowler/All-rounder/Wicket Keeper
		
		
		String skill=sc.nextLine();
		
		
		ArrayList<String> skills= new ArrayList<>();
		skills.add("batsman");
		skills.add("bowler");
		skills.add("all-rounder");
		skills.add("wicket Keeper");
	
		if(!skills.contains(skill.toLowerCase()))
		{
			System.out.println("The skill can be only Batsman/Bowler/All-rounder/Wicket Keeper");
			return;
		}
		
		
		System.out.println("Enter the position to add skills");
		int position=sc.nextInt();
		try {
			player.set(position, skill);
		}
		catch(Exception e)
		{
			System.out.println("You entered wrong position, it can be from 0 to 2 only");
		}
		
	
		System.out.println("Enter the position of the detail to be removed");
		int removePosition=sc.nextInt();
		try {
			player.remove(removePosition);
		}
		catch(Exception e)
		{
			System.out.println("You entered wrong position, it can be from 0 to 2 only");
		}
		
		
		printDetails(player);
		//remove position
		
		
	}

}
