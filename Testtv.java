public class Testtv {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(35);
        tv1.setVolume(3);
        System.out.println("tv's chaneel is "+tv1.channel +"  and Volume Level is " +
                " "+tv1 . volume);
        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channelup();
        tv2.volumeup();
        tv2.volumeup();
        System.out.println("tv's chaneel is "+tv2.channel +"  and Volume Level is " +
                " "+tv2 . volume);
    }
}
