package com.testpackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Введите произвольное число, которое хотите возвести в степень: ");
		double a = input.nextDouble();

		int n = 0;
		boolean isValid = false;
		while(!isValid) {
			System.out.print("Введите натуральое число: ");
			n = input.nextInt();

			if(n > 0){
				isValid = true;
			} else {
				System.out.printf("Число %d не натуральое \n", n);
			}
		}

		double power = a;
		for (int i = 1; i < n; i++) {
			power *= a;
		}

		System.out.println("Число " + a + " в степени " + n + " равно " + power);
	}
}
