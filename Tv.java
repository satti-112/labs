public class Tv {

    int channel = 1;
    int volume = 1;
    boolean on = false;


    public Tv() {

    }

    public void turnOn() {
        on = true;
    }

    public void trunOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 128) {
            channel = newChannel;
        }

    }
    public void setVolume(int newVolumeLevel){
        if(on && volume >=1 && volume<= 7){
            volume=newVolumeLevel;
        }
    }
    public void channelup ( ){
        if(on && channel<120){
            channel++;

        }
    }
    public void channeldown( ){
        if(on && channel>1){
            channel--;

        }
    }
    public void volumeup(){

        if(on && volume < 7){
            volume++;
        }
    }
    public void volumedown(){

        if(on && volume >1){
            volume--;
        }
    }

}