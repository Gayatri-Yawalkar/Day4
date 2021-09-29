package com.bridgelabz.snakeladder;
//Uc6
public class SinglePlayer {
	public static int startWithZeroPosition() {
		int position=0;
		return position;
	}
	public static int getDieNumber() {
		int die=(int)Math.floor(Math.random()*6)+1;
		return die;
	}
	public static int checkSnakeOrLadder(int die,int pos) {
		int option=(int)Math.floor(Math.random()*3);
		if(option==0) {
			pos=pos;
		}
		else if(option==1) {
			if((pos+die)<=100) {
				pos=pos+die;
			}
		}
		else {
			if((pos-die)<=0)
			{
				pos=0;
			}
			else {
				pos=pos-die;
			}
		}
		return pos;
	}
	public static void main(String[] args) {
		int lastPos=100;
		int player1Pos=startWithZeroPosition();
		int dieNumber,diceCount=0;
		while(player1Pos!=lastPos) {
			dieNumber=getDieNumber();
			diceCount=diceCount+1;
			player1Pos=checkSnakeOrLadder(dieNumber,player1Pos);
			System.out.println("Position="+player1Pos);
		}
		System.out.println("Number of Times Dice Played"+diceCount);		
	}
}
