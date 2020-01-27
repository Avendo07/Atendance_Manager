package com.example.attend;

public class Subject {
    private String subject;
    private int attended;
    private int total;
    private float perc;

    public Subject(String subject) {
        this.subject = subject;
        attended = 0;
        total = 0;
        perc = 0;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAttended() {
        return attended;
    }

    public void setAttended(int attended) {
        this.attended = attended;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public float getPerc() {
        return perc;
    }

    public void setPerc(float perc) {
        this.perc = perc;
    }
}
