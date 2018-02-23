import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;

public class Usermessage {
	 static final String NIRCMD = "C:\\Users\\oscar\\Downloads\\praktikum_2018\\NIRCMD\\nircmd.exe";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			
		String help, volumeup,volumedown, brightnessup,brightnessdown, musicskip, musicplay, musicstop,command;
		
		Scanner scannerVariable = new Scanner(System.in);
//		AudioSystem
		
		
	for (;true;) {
		command=scannerVariable.nextLine();
			
		
		if (command.equals("help")) {
			System.out.println("-brightnessup -brightnessdown -musicplay -musicstop -musicskip -volumeup -volumedown");
		
			}else if (command.equals("volumeup")) {
				  // Setzt die Systemlautstärke auf 100%
		        Runtime.getRuntime().exec(NIRCMD + " changesysvolume 10000 ");
				System.out.println("Lautstärke wurde erhöht.");
		
			}else if (command.equals("volumedown")) {
				// Senkt die Systemlautstärke um .
				  Runtime.getRuntime().exec(NIRCMD + " changesysvolume -10000");
				System.out.println("Lautstärke wurde gesenkt.");	
				
			}else if (command.equals("mute")) {
				//Mutet die Systemlautstärke.
				  Runtime.getRuntime().exec(NIRCMD + " mutesysvolume 1");
				  System.out.println("Sound wurde gemutet.");
				  
			}else if (command.equals("entmute")) {
				//Entmutet die Systemlautstärke.
				  Runtime.getRuntime().exec(NIRCMD + " mutesysvolume 0");
				  System.out.println("Sound wurde entmutet.");
				  
			}else if (command.equals("brightnessup")) {
				Runtime.getRuntime().exec(NIRCMD + " changebrightness 5");
				System.out.println("Helligkeit wurde aufgestockt.");
		
			}else if (command.equals("setbrightness")) {
				Runtime.getRuntime().exec(NIRCMD + " changebrightness -5");
				System.out.println("Helligkeit wurde reduziert.");
		
			}else if (command.equals("opencd")) {
				Runtime.getRuntime().exec(NIRCMD + " cdrom open d:");
				System.out.println("Laufwerk wurde geöffnet.");
		
			}else if (command.equals("start")) {
				Runtime.getRuntime().exec(NIRCMD + " exec show C:\\Windows\\System32\\cmd.exe");
				System.out.println("Programm wurde gestartet.");
		
			}else if (command.equals("poweroff")) {
				Runtime.getRuntime().exec(NIRCMD + " exitwin power off");
				System.out.println("Pc wird heruntergefahren.");
		
		}

	}
	
}
	
}
