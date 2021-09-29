package com.bridgelabz.snakeladder;
//Uc2
public class DieRolls {
	public static int startWithZeroPosition() {
		int position=0;
		return position;
	}
	public static int getDieNumber() {
		int die=(int)Math.floor(Math.random()*6)+1;
		return die;
	}
	public static void main(String[] args) {
		int player1Pos=startWithZeroPosition();
		int dieNumber=getDieNumber();
}
}
