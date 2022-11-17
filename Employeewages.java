package com.bridgelab.employeewage;

import java.util.Scanner;

/* /* UC2 Employee daily wages full time hours is 8 hours/day */
public class Employeewages {
	public static void dailywages() {
		Scanner hours = new Scanner(System.in);

		System.out.println(" number of hours worked :");
		int workedhours = hours.nextInt();
		int fulltimehours = 8;
		if (workedhours == fulltimehours) {
			System.out.println("present ");
			System.out.println("wage for one hour=20rs ");
			System.out.println("fulltime hours=8 hours/day");
			int wage = 20;
			int fulltimewage = wage * 1 * workedhours;
			System.out.println("wages of employee per day: " + fulltimewage);
		} else {
			System.out.println("invalid hours for fulltime it should be 8 hours ");
		}
	}

	/* UC3 Employee part-time wages part time hours for day is 4 hours */
	public static void Parttimewages() {
		int Parttimehours = 4;
		Scanner hours = new Scanner(System.in);

		System.out.println("number of hours worked :" + workedhours);
		int workedhours = hours.nextInt();
		if (workedhours == Parttimehours) {
			System.out.println("present ");
			System.out.println("wage for one hour=20rs ");
			System.out.println("parttime hours=4 hours/day");
			int wage = 20;
			int parttimewage = wage * 1 * workedhours;
			System.out.println("wages of employee per day: " + parttimewage);
		}
	}

	/* uc5: employee month wage */
	public static void monthlywages() {
		int wage = 20;
		int monthdays = 20;
		int fulltimehours = 8;

		int monthlywages = wage * fulltimehours * monthdays;
		System.out.println("wages of employee per month: " + monthlywages);
	}

	/*
	 * uc6:Calculate Wages till a condition of total working hours or days is
	 * reached for a month - Assume 100 hours and 20 days
	 */
	public static void monthlyhourwages() {
		int wage = 20;
		int monthdays = 20;
		int fullmonthhours = 100;
		Scanner sc = new Scanner(System.in);

		System.out.println("number of hours worked :");
		int hours = sc.nextInt();

		System.out.println("number of days worked :");
		int days = sc.nextInt();

		if (hours <= fullmonthhours && days <= fullmonthhours) {
			int monthlywages = wage * hours * days;
			System.out.println("wages of employee per month: " + monthlywages);
		} else {
			System.out.println("invalid days or number");
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

			case 2:
				System.out.println("option 2: parttime wages");
				Employeewages.Parttimewages();
				break;
			case 3:
				System.out.println("option 3: monthly wages");
				Employeewages.monthlywages();
				break;
			case 4:
				System.out.println("option 4: monthlyhourly wages");
				Employeewages.monthlyhourwages();

			default:
				break;
			}
		} else {
			System.out.println("absent");
		}
	}

}
