package fr.esipe.ic.tu;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {

	private int max;
	private int min;
	private int r;

	public GameEngine(int max, int min) {
		max = 100;
		min = 1;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void game() {
		int r = random();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		while (r != i) {
			
			if (r > i) {
				System.out.println("plus grand");
				Scanner sc2 = new Scanner(System.in);
				i = sc2.nextInt();
			}
			if (r < i) {
				System.out.println("plus petit");
				Scanner sc2 = new Scanner(System.in);
				i = sc2.nextInt();
			}
			
			
		}
		System.out.println("nombre trouvé");

	}
	
	public int random() {
		Random ran = new Random();
		this.r = ran.nextInt(100);
		return r;
	}

}
