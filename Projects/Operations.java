package com.digit.javaTraining.Projects;


import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Operations {
	Scanner sc = new Scanner(System.in);
	String s1, opt, again, llopt, name;
	int option, answer, level = 1, e, ac = 0, org, ll = 2, set;
	int amount[] = { 0, 10000, 50000, 125000, 500000, 750000, 1000000, 2500000, 5000000, 10000000, 25000000 };
	String loption[] = { "A:Audience Call ", "B:50:50" };
	String fiftyopt[] = { "A", "B", "C", "D" };
	Random r = new Random();
	
	

	void amounts() {
		int level = 1;
		for (int i = 0; i < amount.length - 1; i++) {
			System.out.println(
					"\nFor level \033[1m" + level + "\033[0m  Price Money is \033[1m" + amount[i + 1] + "\033[0m");
			level++;
		}
	}

	void exit() {
		System.out.println("\nThank you for take part🌹 .");
		System.exit(0);
	}

	void check() {
		
		if (answer == option) {
			System.out.println("\n\u001B[33m🎉🎉\u001B[35m🎉\u001B[32m🎉Congratulation 🎉\u001B[35m🎉\u001B[33m🎉\033[0m");
			System.out.println("\nYou Won the amount of \u001B[33m🎁 \u001B[0m\033[1m" + amount[level] + " Rs/-\033[0m");

			level++;
		} else {
			System.out.println("\u001B[31m\nWrong Answer");
			System.out.println("\nYou Won the amount of \033[1m  " + amount[level - 1] + " Rs/-\033[0m ");
			System.out.println("\nBetter Luck next time");
			exit();
		}
		System.out.println("\nPress anything to move to next question\n");
		again = sc.next();

		System.out.println("\nHere is the Next question for you");
		System.out.println("\nyour level is  \033[1m" + level + "  \033[0m and the price Money is  \033[1m "
				+ amount[level] + "\033[0m ");

	}

	void lifeline() {

		System.out.println("\nYour Life Line left:" + ll);
		if (ll < 0) {
			ll = 0;
		}

		for (int i = 0; i < loption.length; i++) {
			System.out.println("\033[1m"+loption[i]+"\033[0m");
		}
		if (ll > 0) {
			choice();
		}

		if (ll == 0) {
			System.out.println("\nLife line finish");
			choice();
		} else if (option == 1) {
			System.out.println("\nYou have choose\033[1m Audience Call\033[0m ");
			ac++;
			if (loption[0] == " ") {
				System.out.println("\nYou have already used this option.");
				choice();
				fifty();
			} else {
				audienceCall();
			}

		} else if (option == 2) {
			System.out.println("\nYou have choose \033[1m 50:50\033[0m ");
			ac++;

			if (loption[1] == " ") {
				System.out.println("\nYou have already used this option.");
				choice();
				audienceCall();
			} else {
				fifty();
			}

		}

		ll--;

	}

	void audienceCall() {
		int ac[] = new int[3];
		int x = 0;

		for (int i = 0; i <= 2; i++) {
			ac[i] = r.nextInt(20);
		}
		x = 100 - (ac[0] + ac[1] + ac[2]);
		if (answer == 1) {

			System.out.print("\nA : " + x + " %");
			System.out.print("\nB : " + ac[0] + " %");
			System.out.print("\nC : " + ac[1] + " %");
			System.out.print("\nD : " + ac[2] + " %");
		}
		if (answer == 2) {
			System.out.print("\nA : " + ac[0] + " %");
			System.out.print("\nB : " + x + " %");
			System.out.print("\nC : " + ac[1] + " %");
			System.out.print("\nD : " + ac[2] + " %");
		}
		if (answer == 3) {
//			System.out.println("C:78%");

			System.out.print("\nA : " + ac[1] + " %");
			System.out.print("\nB : " + ac[0] + " %");
			System.out.print("\nC : " + x + " %");
			System.out.print("\nD : " + ac[2] + " %");
		}
		if (answer == 4) {
//			System.out.println("D:78%");

			System.out.print("\nA : " + ac[2] + " %");
			System.out.print("\nB : " + ac[0] + " %");
			System.out.print("\nC : " + ac[1] + " %");
			System.out.print("\nD : " + x + " %");
		}
		loption[0] = " ";
		llchoice();
	}

	void fifty() {
		int rn = r.nextInt(4);

		org = answer - 1;
		if (rn == org) {
			rn = rn - 1;
		}
		if (answer == 1) {
			System.out.println(
					"\nThe two Option remaining are \033[1m " + fiftyopt[org] + " &" + fiftyopt[rn] + "\033[0m ");
		} else if (answer == 2 && rn != org) {
			System.out.println(
					"\nThe two Option remaining are \033[1m " + fiftyopt[org] + " &" + fiftyopt[rn] + "\033[0m ");
		} else if (answer == 3 && rn != org) {
			System.out.println("\nThe two Option remaining are \033[1m" + fiftyopt[org] + " &" + fiftyopt[rn] + "\033[0m ");

		} else if (answer == 4 && rn != org) {
			System.out
					.println("\nThe two Option remaining are \033[1m" + fiftyopt[org] + " &" + fiftyopt[rn] + "\033[0m ");

		}
		loption[1] = " ";

		llchoice();
	}

	void choice() {
		System.out.println("\nEnter Your Answer:-");
		opt = sc.next();
		if (opt.equalsIgnoreCase("a")) {
			option = 1;
		} else if (opt.equalsIgnoreCase("b")) {
			option = 2;
		} else if (opt.equalsIgnoreCase("c")) {
			option = 3;
		} else if (opt.equalsIgnoreCase("d")) {
			option = 4;
		} else if (opt.equalsIgnoreCase("l")) {
			lifeline();
		} else {
			System.out.println("\nPress a Valid Option.");
			choice();
		}
		System.out.println("\n");
	}

	void llchoice() {
		System.out.println("\nEnter your life line  choice:-");
		opt = sc.next();
		if (opt.equalsIgnoreCase("a")) {
			option = 1;
		} else if (opt.equalsIgnoreCase("b")) {
			option = 2;
		} else if (opt.equalsIgnoreCase("c")) {
			option = 3;
		} else if (opt.equalsIgnoreCase("d")) {
			option = 4;
		} else {
			System.out.println("\nPress a Valid Option.");
			choice();
		}
		System.out.println("\n");
	}
	void win() {
		
		JFrame frame = new JFrame("GIF Display");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon win = new ImageIcon("C:\\Users\\Basudev.kirtania\\Downloads\\7karode.gif");
		ImageIcon lost = new ImageIcon("C:\\Users\\Basudev.kirtania\\Downloads\\7karode.gif");

		JLabel label = new JLabel(win);
		JLabel label1 = new JLabel(lost);

		frame.getContentPane().add(label);
		frame.getContentPane().add(label1);

		frame.pack();
		frame.setVisible(true);
		frame.repaint();
		frame.setAlwaysOnTop(true);
		}


	}



