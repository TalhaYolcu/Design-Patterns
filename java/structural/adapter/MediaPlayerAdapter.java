package design_patterns.java.structural.adapter;

//MediaPlayerAdapter, depend on the file type, call the necessary player
//Adapter should inherit the Mediaplayer, because we want to play something
public class MediaPlayerAdapter implements MediaPlayer {
    //adapter should have an advanced media player so that it can play all types
    private AdvancedMediaPlayer advancedMediaPlayer;

    //in constructor it takes advanced media player
    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer=advancedMediaPlayer;
    }

    //play a file, depend on the type, run the necessary media player
    @Override
    public void play(String file) {
        
        if(file.endsWith(".mp3")) {
            advancedMediaPlayer.playMp3(file);
        }
        else if(file.endsWith(".mp4")) {
            advancedMediaPlayer.playMp4(file);
        }
    }
}
