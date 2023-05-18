import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void numberStationMinus() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationZero() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation1() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation5() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation9() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation10() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation11() {
        Radio radio = new Radio();

        radio.setRadioStationNumber(11);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollThroughTheLastStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollStation5() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollStationZero() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackTheLastStation() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation1() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation5() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation9() {
        Radio radio = new Radio();
        radio.setRadioStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void name() {
    }

    @Test
    public void increaseTheVolumeZero() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.nextVolme();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume50() {
        Radio radio = new Radio();
        radio.setSoundVolume(50);

        radio.nextVolme();

        int expected = 51;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheLastVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.nextVolme();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume101() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        radio.nextVolme();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        radio.nextVolme();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionZero() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.prevVolme();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction50() {
        Radio radio = new Radio();
        radio.setSoundVolume(50);

        radio.prevVolme();

        int expected = 49;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction100() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);

        radio.prevVolme();

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction101() {
        Radio radio = new Radio();
        radio.setSoundVolume(101);

        radio.prevVolme();

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionMinus() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);

        radio.prevVolme();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

}