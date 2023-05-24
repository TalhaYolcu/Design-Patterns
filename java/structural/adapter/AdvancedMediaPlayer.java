package design_patterns.java.structural.adapter;

//advanced media player can play mp3,mp4
public class AdvancedMediaPlayer {
    public void playMp3(String file) {
        System.out.println("Playing mp3");
    }

    public void playMp4(String file) {
        System.out.println("Playing mp4");
    }
}
