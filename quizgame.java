package day3;

import javax.swing.JOptionPane;

public class quizgame {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("How are you?");
		speak("potato");
	}

	static void speak(String words) {
		System.out.println("asds");
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}