package com.bridgelabz.snakeladder;
//Uc4
public class WinPosition {
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
				pos=pos+die;
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
		int player1Pos=startWithZeroPosition();
		int dieNumber=getDieNumber();
		while(player1Pos!=100) {
			dieNumber=getDieNumber();
			player1Pos=checkSnakeOrLadder(dieNumber,player1Pos);
		}
	}
}
