package main;

import java.util.*;

enum Hand {
	ROCK, PAPER, SCISSORS, WELL;

	private static Map<Hand, Set<Hand>> beatsMap = Map.of(
		ROCK, Set.of(SCISSORS),
		SCISSORS, Set.of(PAPER),
		PAPER, Set.of(ROCK, WELL),
		WELL, Set.of(ROCK, SCISSORS)
	);

	private static Random random = new Random();

	boolean beats(Hand other) {
		return beatsMap.get(this).contains(other);
	}

	static Hand random() {
		Hand[] options = Hand.values();
		int selected = random.nextInt(options.length);

		return options[selected];
	}
}

public class Main {
	public static void main(String[] args) {
		Hand first = Hand.random();
		Hand second = Hand.random();
		System.out.printf("%s %s %b", first, second, first.beats(second));
	}
}
