package gameV2;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class audioInputStream2 {


    public audioInputStream2() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // TODO Auto-generated method stub
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("miimusic.wav").getAbsoluteFile());
        System.out.println("AUDIO");
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        FloatControl gainControl =
                (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
        //gainControl.setValue(-10.0f); // Reduce volume by 10 decibels.
        clip.start();

        try {
            //Thread.sleep(10000);
           gainControl.setValue(6.0206f);//6.0206f
            //Thread.sleep(10000);
            //gainControl.setValue(-10.0f);
            //Thread.sleep(10000);
           // gainControl.setValue(6.0206f);
            Thread.sleep(10000);
            //gainControl.setValue(-10.0f);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}