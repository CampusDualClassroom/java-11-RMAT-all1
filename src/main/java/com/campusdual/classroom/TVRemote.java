package com.campusdual.classroom;

public class TVRemote {

    boolean on;
    int channel;
    int volume;
    String color;

    // Constructor
    public TVRemote(String color) {
        this.color = color;
        this.channel = 0;
        this.volume = 20;
    }

    // Métodos para encender y apagar la TV
    public boolean turnOn() {
        this.on = true;
        return this.on;
    }

    public boolean turnOff() {
        this.on = false;
        return this.on;
    }

    // Métodos para gestionar el canal
    public void channelUp() {
        this.channel++;
    }

    public void channelDown() {
        if (this.checkMinValue(this.channel)) {
            if (this.channel > 0) {
                this.channel--;
            }
        }
    }

    // Métodos para gestionar el volumen
    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        if (this.checkMinValue(this.volume)) {
            if (this.volume > 0) {
                this.volume--;

            }
        }
    }

    // Méodo para obtener el color del mando
    public String getColor() {
        return this.color;
    }

    private boolean checkMinValue(int value) {
        if (value == 0) {
        } else {
        }
        return true;
    }
}




