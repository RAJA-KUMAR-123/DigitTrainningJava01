package com.digit.javaTraining.Projects;

//public class questions {
//
//}

import java.util.Scanner;

public class questions extends Operations {

	void playgame() {

		System.out.println("Here We Go\n");
		// 1st Question
		System.out.println("your level is  \033[1m" + level + "  \033[0m and the price Money is  \033[1m "
				+ amount[level] + "\033[0m ");
		System.out.print("\nYou can use Life Line by enter\033[1m L \033[0m");
		System.out.print("\nEnter any key to continue : ");
		again = sc.next();

		System.out.println("\033[1mWhat is the full Name of MS DHONI is-\033[0m\n");
		System.out.println("A.Mohammad Shing Dhoni                   B.Mahendra Shing Dhoni");
		System.out.println("C.MonMohan Sing Dhoni                    D.Mohan Sharma Dhoni");
		
		answer = 2;
		choice();

		check();

		// 2nd Question

		System.out.println("\033[1mWho is the Father of Java\033[0m\n");
		System.out.println("A.James Gosling                     B.Newton");
		System.out.println("C.Charls Babbage                    D.Anthony");
		answer = 1;
		
		choice();
		check();

		// 3th Question

		System.out.println("\033[1mWhich city is known as pink city \033[0m\n");
		System.out.println("A.Jaipur                            B.Patna");
		System.out.println("C.Assam                             D.Gurgaon");
		answer = 1;
		
		choice();
		check();

		// 4th Question
		System.out.println("\033[1mCapital of Telengana\033[0m\n");
		System.out.println("A.Hyderabad                        B.Mumbai");
		System.out.println("C.Visakhapatnam                    D.Chennai");
		answer = 1;
		
		choice();
		check();

		// 5th Question

		System.out.println("\033[1mWhich team won The IPL2023\033[0m\n");
		System.out.println("A.RCB                               B.RR");
		System.out.println("C.CSK                               D.MI");
		answer = 3;
		
		choice();
		check();

		// 6th Question

		System.out.println("\033[1mWho was the first person who entered into space?\033[0m\n");
		System.out.println("A.Neil Armstrong                      B. Yuri Gagari");
		System.out.println("C.William Lundigan                    D.Edward McCauley");
		answer = 2;
		choice();
		check();

		// 7th Question

		System.out.println("\033[1mNataraja temple is located in\033[0m\n");
		System.out.println("A.Karnataka                          B.Odisha");
		System.out.println("C.Maharastra                         D.Tamil Nadu");
		answer = 4;
		choice();
		check();
	
		// 8th Question

		System.out.println("\033[1mNational Emblem of the United States is______ \033[0m\n");
		System.out.println("A.Kangaroo                             B.White Lily\n");
		System.out.println("C.Rose                                 D.Lily");
		answer = 3;
		choice();
		check();
		// 9th Question

		System.out.println("\033[1mThe ‘Dhyan Chand Trophy’ is related to ______\033[0m\n");
		System.out.println("A.Hockey                                B.Cricket\n");
		System.out.println("C.Badmiton                              D.Football");
		answer = 1;
		choice();
		check();

		// 10th Question

		System.out.println("\033[1mThe ‘Begum Hazrat Mahal Trophy’ is related to\033[0m\n");
		System.out.println("A.Hockey                                B.Cricket\n");
		System.out.println("C.Badmiton                              D.Football");
		answer = 4;
		choice();
		if (answer == option) {
			System.out.println("\n\033[1m🎉🎉🎉Congratulation 🎉🎉🎉\033[0m");
			System.out.println("\nYou Won the amount of  \033[1m🎁5 🎁 🎁" + amount[level] + " Rs/-\033[0m");
			System.out.println("CONGRATUALTION WE ARE THE WINNER...");

			
		} else {
			System.out.println("\nYou Won the amount of \033[1m  " + amount[level - 1] + " Rs/-\033[0m ");
			System.out.println("\nBetter Luck next time");
			
			exit();
		}

		
	}

}
