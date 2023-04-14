package Opgave1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TVTest {
    TV tv1 = new TV();
    TV tv2 = new TV();

    @Test
    public void Tv(){
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        tv2.channelUp();
        tv2.channelUp();
        tv2.turnOn();
        tv2.volumeUp();

        assertEquals(30,tv1.channel);
        assertEquals(0,tv2.channel);
        tv2.channelUp();
        assertEquals(1,tv2.channel);

    }
}