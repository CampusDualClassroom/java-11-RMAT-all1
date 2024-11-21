package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        //Colores de los mandos
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());

        //Encender
        redRemote.turnOn();
        redRemote.channelUp();
        redRemote.channelDown();

        //Canal 0 y no se puede bajar mas
        redRemote.channelDown(); //quedar en 0
        redRemote.channelDown(); // Bajar estando en 0

        //Volumen
        redRemote.volumeUp();
        redRemote.volumeDown();
        redRemote.volumeDown(); //en 0

        //Dime color

        System.out.println(" Color del control remoto: " + redRemote.getColor());

        //Apagar

        redRemote.turnOff();

        }

}
