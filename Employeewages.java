package com.bridgelab.employeewage;

import java.util.Scanner;

/* UC1 Employee present or absent*/
public class Employeewages {
	public static void dailywages() {
		Scanner hours = new Scanner(System.in);
		int workedhours = hours.nextInt();
		System.out.println("number of hours worked :" + workedhours);

		int fulltimehours = 8;
		if (workedhours == fulltimehours) {
			System.out.println("present ");
			System.out.println("wage for one hour=20rs ");
			System.out.println("fulltime hours=8 hours/day");
			int wage = 20;
			int fulltimewage = wage * 1 * workedhours;
			System.out.println("wages of employee per day: " + fulltimewage);
		}
	}

	public static void main(String[] args) {
		Scanner Myobj = new Scanner(System.in);
		int is_fulltime = 1;
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == is_fulltime) {
			System.out.println(
					"\n option 1:fulltime wage \n \n option 2: parttime wages\n \n option 3: monthly wages\n \n option 4: monthlyhourly wages\n");
			System.out.println("enter option=");
			int choose_option = Myobj.nextInt();
			switch (choose_option) {
			case 1:
				System.out.println("option 1: fulltime wages");
				Employeewages.dailywages();

				break;
			/*
			 * case 2: System.out.println("option 2: parttime wages");
			 * Employeepresentabsent.Parttimewages(); break; case 3:
			 * System.out.println("option 3: monthly wages");
			 * Employeepresentabsent.monthlywages(); break; case 4:
			 * System.out.println("option 4: monthlyhourly wages");
			 * Employeepresentabsent.monthlyhourwages();
			 */
			default:
				break;
			}
		} else {
			System.out.println("absent");
		}
	}

}
