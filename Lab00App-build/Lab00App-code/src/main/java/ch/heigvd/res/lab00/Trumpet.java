/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

interface IInstrument {

    public String play();

    public int getSoundVolume();

    public String getColor();
    
}

/**
 *
 * @author Mario Ferreira
 */
public class Trumpet implements IInstrument{
    private String sound = "pouet";
    private String color = "golden";
    private int volume = 100;

    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
}

class Flute implements IInstrument {
    private String sound = "fluteee";
    private String color = "white";
    private int volume = 90;

    public Flute() {
    }

    @Override
    public String play() {
        return sound;
    }

    @Override
    public int getSoundVolume() {
        return volume;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}