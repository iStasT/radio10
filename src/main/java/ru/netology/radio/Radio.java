package ru.netology.radio;

public class Radio {
    private int maxStationNumber = 9;
    private int minStationNumber = 0;
    private int currentStationNumber = minStationNumber;

    private int maxSoundVolume = 100;
    private int minSoundVolume = 0;
    private int currentSoundVolume = minSoundVolume;

    private int radioStationNumber;
    private int soundVolume;

    public Radio(int quantityStation) {
        minStationNumber = 0;
        maxStationNumber = quantityStation - 1;
        currentStationNumber = radioStationNumber;

        this.maxSoundVolume = maxSoundVolume;
        this.minSoundVolume = minSoundVolume;
        currentSoundVolume = soundVolume;
    }

    public Radio() {

    }

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < minStationNumber) {
            newRadioStationNumber = maxStationNumber;
        }
        if (newRadioStationNumber > maxStationNumber) {
            newRadioStationNumber = minStationNumber;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            newSoundVolume = minSoundVolume;
        }
        if (newSoundVolume > maxSoundVolume) {
            newSoundVolume = maxSoundVolume;
        }
        soundVolume = newSoundVolume;
    }

    public void nextStation() {
        radioStationNumber = radioStationNumber + 1;
        if (radioStationNumber > maxStationNumber) {
            radioStationNumber = minStationNumber;
        }
    }

    public void prevStation() {
        radioStationNumber = radioStationNumber - 1;
        if (radioStationNumber < minStationNumber) {
            radioStationNumber = maxStationNumber;
        }
    }

    public void nextVolme() {
        soundVolume = soundVolume + 1;
        if (soundVolume > maxSoundVolume) {
            soundVolume = maxSoundVolume;
        }
    }

    public void prevVolme() {
        soundVolume = soundVolume - 1;
        if (soundVolume < minSoundVolume) {
            soundVolume = minSoundVolume;
        }
    }
}