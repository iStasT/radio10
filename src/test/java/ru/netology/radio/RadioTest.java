package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void numberStationMinus() {

        radio.setRadioStationNumber(-1);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStationZero() {

        radio.setRadioStationNumber(0);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation1() {

        radio.setRadioStationNumber(1);

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation5() {

        radio.setRadioStationNumber(5);

        int expected = 5;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation9() {

        radio.setRadioStationNumber(9);

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation10() {

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberStation11() {

        radio.setRadioStationNumber(11);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollThroughTheLastStation() {
        radio.setRadioStationNumber(9);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollStation5() {

        radio.setRadioStationNumber(5);

        radio.nextStation();

        int expected = 6;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollStationZero() {
        radio.setRadioStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackTheLastStation() {
        radio.setRadioStationNumber(0);

        radio.prevStation();

        int expected = 9;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation1() {

        radio.setRadioStationNumber(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation5() {

        radio.setRadioStationNumber(5);

        radio.prevStation();

        int expected = 4;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void scrollBackStation9() {

        radio.setRadioStationNumber(9);

        radio.prevStation();

        int expected = 8;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeZero() {

        radio.setSoundVolume(0);

        radio.nextVolme();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume50() {

        radio.setSoundVolume(50);

        radio.nextVolme();

        int expected = 51;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheLastVolume() {

        radio.setSoundVolume(100);

        radio.nextVolme();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolume101() {

        radio.setSoundVolume(101);

        radio.nextVolme();

        int expected = 100;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeMinus() {

        radio.setSoundVolume(-1);

        radio.nextVolme();

        int expected = 1;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionZero() {

        radio.setSoundVolume(0);

        radio.prevVolme();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction50() {

        radio.setSoundVolume(50);

        radio.prevVolme();

        int expected = 49;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction100() {

        radio.setSoundVolume(100);

        radio.prevVolme();

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReduction101() {

        radio.setSoundVolume(101);

        radio.prevVolme();

        int expected = 99;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeReductionMinus() {

        radio.setSoundVolume(-1);

        radio.prevVolme();

        int expected = 0;
        int actual = radio.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationMinus () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(-1);

        int expected = 29;
        int acteal = radio.getRadioStationNumber();

        Assertions.assertEquals(expected,acteal);

    }

    @Test
    public void radioMoreStation1 () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(1);

        int expected = 1;
        int acteal = radio.getRadioStationNumber();

        Assertions.assertEquals(expected,acteal);

    }

    @Test
    public void radioMoreStationMiddle () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(15);

        int expected = 15;
        int acteal = radio.getRadioStationNumber();

        Assertions.assertEquals(expected,acteal);

    }

    @Test
    public void radioMoreStationMax () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(29);

        int expected = 29;
        int acteal = radio.getRadioStationNumber();

        Assertions.assertEquals(expected,acteal);

    }

    @Test
    public void radioMoreStation30 () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(30);

        int expected = 0;
        int acteal = radio.getRadioStationNumber();

        Assertions.assertEquals(expected,acteal);

    }

    @Test
    public void radioMoreStationNextStationZero () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(0);

        radio.nextStation();

        int expected = 1;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationNextStationMiddle () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(15);

        radio.nextStation();

        int expected = 16;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationNextStationEnd () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(28);

        radio.nextStation();

        int expected = 29;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationNextStationScrollLast () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(29);

        radio.nextStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationPrevStationScrollLast () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(0);

        radio.prevStation();

        int expected = 29;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationPrevStation1 () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(1);

        radio.prevStation();

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationPrevStationMiddle () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(15);

        radio.prevStation();

        int expected = 14;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMoreStationPrevStationMax () {
        Radio radio = new Radio(30);

        radio.setRadioStationNumber(29);

        radio.prevStation();

        int expected = 28;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}