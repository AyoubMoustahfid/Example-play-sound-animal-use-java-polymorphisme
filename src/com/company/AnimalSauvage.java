package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AnimalSauvage extends Animal {

    public void ReadSound(String effectSource) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(effectSource));
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        System.out.println(effectSource + " sound is start ! ");
        System.out.println("s : " + clip.isActive());
        while (clip.isActive()) {
            System.out.println("hola "+effectSource);
        }
        clip.close();
        System.out.println(effectSource + " sound is end ! ");
    }

	

	
}
