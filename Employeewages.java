package com.bridgelab.employeewage;

import java.util.Scanner;

/* UC1 Employee present or absent*/
public class Employeewages {
	public static void main(String[] args) {
		int is_present = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == is_present) {
			System.out.println("present ");

		} else {
			System.out.println("absent");
		}

	}

}
