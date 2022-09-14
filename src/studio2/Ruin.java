package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter start amount");
		int startAmount = in.nextInt();
		System.out.println("win Chance");
		float winChance = in.nextFloat();
		System.out.println("Win Limit");
		int winLimit = in.nextInt();
		System.out.println("total simulations");
		int totalSimulations = in.nextInt();
		int money = startAmount;
		int ruin = 0;
		int gamesPlayed = 0;
		for (int i = 0; i < totalSimulations; i++ ) {

			while ((money > 0) && (money < winLimit)){
				if (winChance > Math.random()){
					money = money + 1;
					gamesPlayed = gamesPlayed +1;
				}
				else {
					money = money - 1;
					gamesPlayed = gamesPlayed +1;
				}

			}
			if (money == 0){
				ruin = ruin + 1;
				System.out.println("Simulation " + i + ": " + gamesPlayed + " LOSE" );

			}
			else {
				System.out.println("Simulation " + i + ": " + gamesPlayed + " WIN" );
			}
			gamesPlayed = 0;
			money = startAmount;
		}
		System.out.println("Loses: " + ruin + " Simulations: " + totalSimulations);
		System.out.println("Ruin Rate from Simulation: " + (double)ruin/totalSimulations + " Expected Ruin Rate: ");



}}
