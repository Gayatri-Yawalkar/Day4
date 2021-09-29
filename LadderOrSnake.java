package com.bridgelabz.snakeladder;
//Uc3
public class LadderOrSnake {
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
			pos=pos-die;
		}
		return pos;
	}
	public static void main(String[] args) {
		int player1Pos=startWithZeroPosition();
		int dieNumber=getDieNumber();
		player1Pos=checkSnakeOrLadder(dieNumber,player1Pos);
}
}
