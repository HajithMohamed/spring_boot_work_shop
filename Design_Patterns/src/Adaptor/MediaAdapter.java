package Adaptor;

public class MediaAdapter implements MediaPlayer{
    private final AdvanceMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType){
        this.advanceMusicPlayer = new AdvanceMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer.playMp4(fileName);
        }
    }
}
