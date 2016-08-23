package structural.adapter;

/**
 * Created by lede on 8/23/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playign vlc file. Name: "+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
