package com.sunnewable.www.solpowpow;

public class PowReader {
    private String day;
    private int time;
    private int powin;
    private int powout;
    private int powtot;
    private int batpow;

    public PowReader(){

    }

    public PowReader ( String day, int time, int powin , int powout, int powtot, int batpow){
                this.day = day;
                this.time = time;
                this.powin = powin;
                this.powout = powout;
                this.powtot = powtot;
                this.batpow = batpow;
    }

    public String getDay() {
        return day;
    }

    public int getTime() {
        return time;
    }

    public int getPowin() {
        return powin;
    }

    public int getPowout() {
        return powout;
    }

    public int getPowtot() {
        return powtot;
    }

    public  int getBatpow() { return batpow;}

    public void setDay(String day) {
        this.day = day;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setPowin(int powin) {
        this.powin = powin;
    }

    public void setPowout(int powout) {
        this.powout = powout;
    }

    public void setPowtot(int powtot) {
        this.powtot = powtot;
    }

    public void setBatpow(int batpow) { this.batpow = batpow;}
}
