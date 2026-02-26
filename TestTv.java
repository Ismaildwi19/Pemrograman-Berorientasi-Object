public class TestTv
{
    public static void main(String[] args){
        TV tv1 =  new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());

        TV tvku = new TV();
        man1.beliTV(tvku);

        System.out.println(man1.cekTV());

        man1.jualSemuaTV();
        System.out.println(man1.cekTV());


        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}