public class Radio {
    private int radioStationNumber;
    private int soundVolume;

    public int getRadioStationNumber() {
        return radioStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setRadioStationNumber(int newRadioStationNumber) {
        if (newRadioStationNumber < 0) {
            newRadioStationNumber = 9;
        }
        if (newRadioStationNumber > 9) {
            newRadioStationNumber = 0;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            newSoundVolume = 0;
        }
        if (newSoundVolume > 100) {
            newSoundVolume = 100;
        }
        soundVolume = newSoundVolume;
    }

    public void nextStation() {
        radioStationNumber = radioStationNumber + 1;
        if (radioStationNumber > 9) {
            radioStationNumber = 0;
        }
    }

    public void prevStation() {
        radioStationNumber = radioStationNumber - 1;
        if (radioStationNumber < 0) {
            radioStationNumber = 9;
        }
    }

    public void nextVolme() {
        soundVolume = soundVolume + 1;
        if (soundVolume > 100) {
            soundVolume = 100;
        }
    }

    public void prevVolme() {
        soundVolume = soundVolume - 1;
        if (soundVolume < 0) {
            soundVolume = 0;
        }
    }
}