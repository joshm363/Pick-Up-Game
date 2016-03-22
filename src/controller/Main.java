package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.PublicGame;

public class Main {

	public static void main(String[] args) {
		
		action(menu());

	}
	
	

	public static void action(int choice) {
		Action action = new Action();
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		while (choice != 0) {
			if (choice == 1) {
				System.out.println("1 - Public Game\n2 - Private Game");
				int type = keyboard.nextInt();
				if (type == 1) {
					System.out.print("Name: ");
					String name = keyboard.nextLine();
					System.out.print("Location: ");
					String loc = keyboard.nextLine();
					System.out.print("Time: ");
					String date = keyboard.nextLine();
					action.hostGamePublic(name, loc, date);
				}
			}
			if(choice == 2){
				
			}
			if(choice == 3){
				ArrayList<PublicGame> a = action.nearMe();
				String output = ""; 
				for(int i = 0; i < a.size(); i++){
					output += a.get(i).getName();
					output += " " + a.get(i).getDate();
					output += "\n";
					
				}
				System.out.println(output);
			}
			if(choice == 4){
				
			}
			choice = menu();
		}
	}
	public static int menu(){
		System.out.println("0 - Quit\n1 - Host Game\n2 - Search Game\n3 - Who's Near Me\n4 - My Games");
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		return keyboard.nextInt();
	}
}
