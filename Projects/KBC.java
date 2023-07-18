package com.digit.javaTraining.Projects;

import java.util.Scanner;
class KBCMain extends questions {

	void welcome() {

		System.out.println(
				" Type \033[1m Y \033[0mto continue\n      \033[1m N \033[0m to quit\n      \033[1m I \033[0m to get all the Information\n      \033[1m A \033[0m to get all the Prize list");

		s1 = sc.next();
		if (s1.equalsIgnoreCase("y")) {
			System.out.println("Let's begin \033[1m The Game of Money\033[0m");
			playgame();
		} else if (s1.equalsIgnoreCase("n")) {
			System.out.println("Thank You 🌹...");
		} else if (s1.equalsIgnoreCase("i")) {
			information();
		}else if (s1.equalsIgnoreCase("a")) {
			amounts();
			System.out.println(" \n");
			welcome();
		} else {
			welcome();
		}

	}

	void information() {
		System.out.println("\033[1mAll the information is given below--\n"+
				"There are 10 Question which you have to answer.\n"+
				"The total winning amount is 25000000\n"
				+ "You will get two life line\033[0m");
		
		System.out.println("Type Y to continue");
		s1 = sc.next();
		if (s1.equalsIgnoreCase("y")) {
			System.out.println("Continue");
			playgame();
		}
	}

	void user() {
		System.out.println("\t\t\033[1m------WELCOME------\033[0m");
		System.out.println("\t\t\u001B[31m\033[1m-------स्वागतम--------\033[0m");

		System.out.println("\033[1mनमस्कार\033[0m \nPlease Enter your name to continue: ");
		name = sc.nextLine();

		System.out.println("Welcome \033[1m" + name + "\033[0m to Kon Banega Crorepati");

	}

}

class KBC {
	public static void main(String[] args) {
		KBCMain kb = new KBCMain();
		kb.user();
		kb.welcome();
		
		

	}
}






























//
//class KBCMain {
//
//	Scanner sc = new Scanner(System.in);
//
//	String s1, opt, again, llopt, name;
//
//	int option, answer, level = 1, ac = 0;
//
//	int amount[] = { 0, 1000, 2000, 5000, 10000, 50000 };
//
//	void information() {
//
//		System.out.println("All the information is given below--");
//
//		System.out.println("Type Y to continue");
//
//		s1 = sc.next();
//
//		if (s1.equalsIgnoreCase("y")) {
//
//			System.out.println("Continue");
//
//			playgame();
//
//		}
//
//	}
//
//	void user() {
//
//		System.out.println("Hii \n Enter Your name");
//
//		name = sc.nextLine();
//
//		System.out.println("------WELCOME------");
//
//		System.out.println("Welcome " + name + " to Kon Banega Crorepati");
//
//	}
//
//	void welcome() {
//
//		System.out.println("Type Y to continue\n N to quit\n I to get all the Information");
//
//		s1 = sc.next();
//
//		if (s1.equalsIgnoreCase("y")) {
//
//			System.out.println("Continue");
//
//			playgame();
//
//		} else if (s1.equalsIgnoreCase("n")) {
//
//			System.out.println("Thank You Take Care");
//
//		} else if (s1.equalsIgnoreCase("i")) {
//
//			information();
//
//		} else {
//
//			welcome();
//
//		}
//
//	}
//
//	void replay() {
//
//		System.out.println("Your game start again ");
//
//		welcome();
//
//	}
//
//	void exit() {
//
//		System.out.println("Thank you for take part .");
//
//		System.exit(0);
//
//	}
//
//	void lifeline() {
//
//		int ll;
//
//		System.out.println("You have 4 Life Line");
//
//		System.out.println("Enter A: for audience call \n B: for Phone a friend C:50:50\n D:");
//
//		llopt = sc.next();
//
//		if (llopt.equalsIgnoreCase("a")) {
//
//			System.out.println("You have choose Audience Call");
//
//			ac++;
//
//		}
//
//		else if (llopt.equalsIgnoreCase("b")) {
//
//			System.out.println("You have choose Phone a Friend");
//
//			ac++;
//
//		} else if (llopt.equalsIgnoreCase("c")) {
//
//			System.out.println("You have choose 50:50");
//
//			ac++;
//
//		} else if (llopt.equalsIgnoreCase("d")) {
//
//			System.out.println("You have choose ");
//
//			ac++;
//
//		}
//
//	}
//
//	void audienceCall() {
//
//	}
//
//	void choice() {
//
//		System.out.println("Enter your choice:-");
//
//		opt = sc.next();
//
//		if (opt.equalsIgnoreCase("a")) {
//
//			option = 1;
//
//		}
//
//		if (opt.equalsIgnoreCase("b")) {
//
//			option = 2;
//
//		}
//
//		if (opt.equalsIgnoreCase("c")) {
//
//			option = 3;
//
//		}
//
//		if (opt.equalsIgnoreCase("d")) {
//
//			option = 4;
//
//		}
//
//		if (opt.equalsIgnoreCase("l")) {
//
//			lifeline();
//
//		}
//
//	}
//
//	void playgame() {
//
//		System.out.println("Here We Go");
//
//// 1st Question
//
//		System.out.println("your level is " + level + " and the price Money is " + amount[level]);
//
//		System.out.println("The full Name of DHONI is-");
//
//		System.out.println("A.Mohammad Shing Dhoni\nB.Mahendra Shing Dhoni\nC.MonMohan Sing Dhoni\nMohan Sharma Dhoni");
//
//		answer = 2;
//
//		choice();
//
//		if (answer == option) {
//
//			System.out.println("Congratulation");
//
//			System.out.println("You Won the amount of " + amount[level] + " Rs/-");
//
//			level++;
//
//		} else {
//
//			System.out.println("You Won the amount of " + amount[level - 1] + " Rs/-");
//
//			System.out.println("Better Luck next time");
//
//			System.out.println("To play again click E");
//
//			again = sc.next();
//
//			if (again.equalsIgnoreCase("e")) {
//
//				replay();
//
//			} else {
//
//				exit();
//
//			}
//
//		}
//
//// 2nd Question
//
//		System.out.println("Here is the Next question");
//
//		System.out.println("your level is " + level + " and the price Money is " + amount[level]);
//
//		System.out.println("Who is the Father of Java");
//
//		System.out.println("A.James Gosling\nB.Charls Babbage\nC.Newton\nD.Anthony");
//
//		answer = 1;
//
//		choice();
//
//		if (answer == option) {
//
//			System.out.println("Congratulation");
//
//			System.out.println("You Won the amount of " + amount[level] + " Rs/-");
//
//			level++;
//
//		} else {
//
//			System.out.println("You Won the amount of " + amount[level - 1] + " Rs/-");
//
//			System.out.println("Better Luck next time");
//
//			System.out.println("To play again click E");
//
//			again = sc.next();
//
//			if (again.equalsIgnoreCase("e")) {
//
//				replay();
//
//			} else {
//
//				exit();
//
//			}
//
//		}
//
//// 3th Question
//
//		System.out.println("Here is the Next question");
//
//		System.out.println("your level is " + level + " and the price Money is " + amount[level]);
//
//		System.out.println("Which city is known as pink city ");
//
//		System.out.println("A.Jeypore\nB.Delhi\nC.bengalore\nD.Chennai");
//
//		answer = 1;
//
//		choice();
//
//		if (answer == option) {
//
//			System.out.println("Congratulation");
//
//			System.out.println("You Won the amount of " + amount[level] + " Rs/-");
//
//			level++;
//
//		} else {
//
//			System.out.println("You Won the amount of " + amount[level - 1] + " Rs/-");
//
//			System.out.println("Better Luck next time");
//
//			System.out.println("To play again click E");
//
//			again = sc.next();
//
//			if (again.equalsIgnoreCase("e")) {
//
//				replay();
//
//			} else {
//
//				exit();
//
//			}
//
//		}
//
//// 4th Question
//
//		System.out.println("Here is the Next question");
//
//		System.out.println("your level is " + level + " and the price Money is " + amount[level]);
//
//		System.out.println("Capital of Telengana");
//
//		System.out.println("A.Bengalore\nB.Vishakhapatnam\nC.Hyderabad\nD.Chennai");
//
//		answer = 3;
//
//		choice();
//
//		if (answer == option) {
//
//			System.out.println("Congratulation");
//
//			System.out.println("You Won the amount of " + amount[level] + " Rs/-");
//
//			level++;
//
//		} else {
//
//			System.out.println("You Won the amount of " + amount[level - 1] + " Rs/-");
//
//			System.out.println("Better Luck next time");
//
//			System.out.println("To play again click E");
//
//			again = sc.next();
//
//			if (again.equalsIgnoreCase("e")) {
//
//				replay();
//
//			} else {
//
//// System.out.println("See you soon");
//
//				exit();
//
//			}
//
//		}
//
//// 5th Question
//
//		System.out.println("Here is the Next question");
//
//		System.out.println("your level is " + level + " and the price Money is " + amount[level]);
//
//		System.out.println("Which team won The IPL2023");
//
//		System.out.println("A.RCB\nB.MI\nC.RR\nD.CSK");
//
//		answer = 4;
//
//		choice();
//
//		if (answer == option) {
//
//			System.out.println("Congratulation");
//
//			System.out.println("You Won the amount of " + amount[level] + " Rs/-");
//
//			replay();
//
//			level++;
//
//		} else {
//
//			System.out.println("You Won the amount of " + amount[level - 1] + " Rs/-");
//
//			System.out.println("Better Luck next time");
//
//			System.out.println("To play again click E");
//
//			again = sc.next();
//
//			if (again.equalsIgnoreCase("e")) {
//
//				replay();
//
//			} else {
//
//// System.out.println("See you soon");
//
//				exit();
//
//			}
//
//		}
//
//	}
//
//}
//
//public class KBC {
//	public static void main(String[] args) {
//
//		KBCMain kb = new KBCMain();
//
//		kb.user();
//
//		kb.welcome();
//
//	}
//}
