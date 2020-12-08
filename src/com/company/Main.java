package com.company;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException; 

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	 AnimalSauvage lion = new AnimalSauvage("lion", "african", 30);
     System.out.println(lion.toString());
	 lion.ReadSound("C:\\Users\\Admin\\Desktop\\Animal\\src\\lioncub2.wav");

	
    }
}
