package main;

public class Main {
	public static void main(String[] args) {
		Hand first = Hand.random();
		Hand second = Hand.random();
		System.out.printf("%s %s %b", first, second, first.beats(second));
	}
}
