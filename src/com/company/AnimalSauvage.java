package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AnimalSauvage extends Animal {
   
	
	
	public AnimalSauvage(String name, String country, int age) {
		super(name, country, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        System.out.println("--------------------------------------");
        System.out.println(effectSource + " sound is start ! ");
        System.out.println("s : " + clip.isActive());
        do{
        	//System.out.println("hola "+effectSource);
        }while(clip.isActive());
        
        clip.close();
        System.out.println(effectSource + " sound is end ! ");
    }

	
  
	
}
