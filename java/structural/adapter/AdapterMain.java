package design_patterns.java.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {

        //media player reference is enough for now, but for additional properties, we could have
        //mediaplayer adapter instance also
        MediaPlayer mediaPlayer=new MediaPlayerAdapter(new AdvancedMediaPlayer());

        mediaPlayer.play("sample.mp3");
        
        mediaPlayer.play("sample.mp4");
    }
}
