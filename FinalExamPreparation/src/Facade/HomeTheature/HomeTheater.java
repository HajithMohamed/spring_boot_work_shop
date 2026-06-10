package Facade.HomeTheature;

public class HomeTheater {
    private Projector projector;
    private DVDPlayer dvdPlayer;
    private SoundSystem soundSystem;
    public HomeTheater(){
       projector = new Projector();
       dvdPlayer = new DVDPlayer();
       soundSystem = new SoundSystem();
    }
    public void watchMovie(){
        projector.turnOnProjector();
        soundSystem.turnOnSoundSystem();
        soundSystem.setVolume(100);
        dvdPlayer.turnOffDVDPlayer();
        dvdPlayer.playMovie();
    }
}
