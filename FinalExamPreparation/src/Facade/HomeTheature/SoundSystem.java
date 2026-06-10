package Facade.HomeTheature;

public class SoundSystem {
    public void turnOnSoundSystem(){
        System.out.println("Sound system turned on");
    }
    public void turnOffSoundSystem(){
        System.out.println("Sound System turned off");
    }

    public void setVolume(int volumeRange){
        if(volumeRange >100 && volumeRange<0){
            System.out.println("invalid range");
        }
        System.out.println("Volume set up to : " + volumeRange);
    }
}
