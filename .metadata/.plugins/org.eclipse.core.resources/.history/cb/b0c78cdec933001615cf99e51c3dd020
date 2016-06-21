package Zork;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Zork {

	public static void main(String[] args) {
		String[][] zork = new String[3][3];

		zork[0][0] = "5,dining room,dusty emptybox,50";
		zork[0][1] = "6,vault,3 walking skeletons,100";
		zork[0][2] = "7,parlor,treasurechest,600";
		zork[1][0] = "3,library,spiders,800";
		zork[1][1] = "2,front room,piano,0";
		zork[1][2] = "4,kitchen,bats,1000";
		zork[2][0] = "0";
		zork[2][1] = "1,foyer,dead scorpion,10";
		zork[2][2] = "0";

		Scanner in = new Scanner(System.in);
		System.out.println("You are standing in the foyer of an old house.");
		System.out.println("You see a dead scorpion.");
		System.out.println("{You can (1)exit to the north or press Q to quit}");
		String temp = in.next();
		int i = 1;
		int j = 1;
		boolean special = false;
		int total = 0; 
		int rooms = 1;
		Random rnd = new Random();
		int chor = rnd.nextInt(8) + 1;
		while (!temp.equals("Q")) {
			String vals[] = zork[i][j].split(",");
			String currentRoom = vals[0];
			total += Integer.parseInt(vals[3]);
			if (currentRoom.equals(""+chor)) {
				total =0;
				System.out.println("You met chor and Lost all your winnings!");
				chor = rnd.nextInt(8) + 1;
			}
			
			zork[i][j] = vals[0] + "," + vals[1] + "," + vals[2] + "," + "0";
			if (!special) {
				System.out.println("You are standing in the " + vals[1] + ".");
				System.out.println("You see a " + vals[2] + ".");
			} else {
				System.out.println("You are standing in the secret room.");
				System.out.println("You see piles of gold.");
				special = false;
			}
			System.out.println("Winnings so far: "+ total);
			Map<String,String> options = new HashMap<String,String>();
			System.out.print("{You can ");
			int k=0;
			if (currentRoom.equals("6")) {
				int randomInt = rnd.nextInt(4);
				if (randomInt == 3) {
					special = true;
				}
				j= j+1;
				System.out.print("(1)exit to the east");
				
			} else {
				if ((i - 1) >= 0) {
					vals = zork[i-1][j].split(",");
					if ((!vals[0].equals("6")|| currentRoom.equals("7")) && !vals[0].equals("0")) {					
						System.out.print("("+ k +")exit to the north");
						options.put(""+k, (i-1)+ "," + j);
						k++;
					}
					
				}
				
				if ((i + 1) <= 2) {
					vals = zork[i+1][j].split(",");
					if ((!vals[0].equals("6")|| currentRoom.equals("7")) && !vals[0].equals("0")) {				
						System.out.print("("+ k +")exit to the south");
						options.put(""+k, (i+1)+ "," + j);
						k++;
					}
					
				}
				if ((j - 1) >= 0) {
					vals = zork[i][j-1].split(",");
					if ((!vals[0].equals("6")|| currentRoom.equals("7"))  && !vals[0].equals("0")) {	
						
						System.out.print("("+ k +")exit to the west");
						options.put(""+k, (i)+ "," + (j-1));
						k++;
					}
					
				}
				if ((j + 1) <= 2) {
					vals = zork[i][j+1].split(",");
					if ((!vals[0].equals("6")|| currentRoom.equals("7"))  && !vals[0].equals("0")) {					
						System.out.print("("+ k +")exit to the east");
						options.put(""+k, (i)+ "," + (j+1));
						k++;
					}
					
				}
			}
			

			System.out.println(" or press Q to quit}");
			temp = in.next();
			
			if (!temp.equals("Q") ) {
				rooms++;
				if (!currentRoom.equals("6")) {
					String[] indexes = options.get(temp).split(",");
					i = Integer.parseInt(indexes[0]);
					j = Integer.parseInt(indexes[1]);
				}
				
			} else {
				break;
			}

		}
		System.out.println("Sorry to see you go!");
		System.out.println("Winnings: "+ total + " and Total Rooms: " + rooms);
		in.close();
	}

}
