package main;

public class Main {
	public static void main(String[] args) {
		Player left = new ComputerPlayer("Left Player");
		Player right = new ComputerPlayer("Right Player");
		System.out.print(left.drawHand() + " ");
		System.out.println(right.drawHand());
		System.out.println(left.lastHand.beats(right.lastHand));
	}
}
