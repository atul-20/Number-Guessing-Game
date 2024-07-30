package Guess_Number;

import java.util.Scanner;

class Guesser{
	//int guessnumber;
	
	public int guessThenumber(){
		//Scanner s=new Scanner(System.in);
		//System.out.println("Guess The Number");
		//guessnumber= s.nextInt();
		
		return (int) (Math.random()*15);// Random Number from Range 1 to 14
	}
	
}

class Player{
	int num;
	
	

	public int guessnum() {
		Scanner s = new Scanner(System.in);
		System.out.println("Player ! Guess the Number");
		num= s.nextInt();
		return num;
	}
	
}

class Umpire{
	int numFromGuesser;
	int nump1;
	int nump2;
	int nump3;
	
	
	public void collectFromGuesser() {
		Guesser g= new Guesser();
		numFromGuesser=g.guessThenumber();
		
	}
	public void collectFromPlay() {
		Player p1= new Player();
		Player p2= new Player();
		Player p3= new Player();
		
		 nump1=p1.guessnum();
		 nump2=p2.guessnum();
		 nump3=p3.guessnum();
		
	}
	
	public void compareNum() {
		
	if(nump1==numFromGuesser) {
		if(nump2==numFromGuesser && nump3==numFromGuesser) {
			System.out.println("Game tied Between All 3 of them");
		}
		else if(nump2==numFromGuesser) {
				System.out.println("Game Tied Between Player 1 and Player 2");
			}
		else if(nump3==numFromGuesser) {
			System.out.println("Game Tied Between Player 1 and Player 3");
		}
	
		
		else {
		System.out.println("Player 1 ! HAs won the game");
		}
	}
	else if(nump2==numFromGuesser) {
		if(nump3==numFromGuesser) {
		System.out.println("Game Tied between player 2 and 3");
	}
		else {
		System.out.println("Player 2 Won the Game");
		}
  }
	else if(nump3==numFromGuesser) {
	System.out.println("Player 3 won the game");	
	}
	else {
		System.out.println("No one won please try again.");
		System.out.println("The Correct Number for this Round Was :"+ numFromGuesser);
	}
	}

}

public class LaunchGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u= new Umpire();
		u.collectFromGuesser();
		u.collectFromPlay();
		u.compareNum();

	}

}
