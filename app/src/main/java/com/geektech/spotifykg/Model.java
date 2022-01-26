package com.geektech.spotifykg;

public class Model {
    private String music;
    private String time;


    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model(String music, String time, String number, String name) {
        this.music = music;
        this.time = time;
        this.number = number;
        this.name = name;
    }

    private String number;
    private String name;
}
