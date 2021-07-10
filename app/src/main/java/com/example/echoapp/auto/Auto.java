package com.example.echoapp.auto;

import java.util.Date;
import java.util.UUID;

public class Auto {

    private UUID ID;
    private String Marca;
    private String Modello;
    private int Cilindrata;
    private Date Anno;
    private String Euro;

    public Auto(UUID ID, String marca, String modello, int cilindrata, Date anno, String euro) {
        this.ID = ID;
        Marca = marca;
        Modello = modello;
        Cilindrata = cilindrata;
        Anno = anno;
        Euro = euro;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModello() {
        return Modello;
    }

    public void setModello(String modello) {
        Modello = modello;
    }

    public int getCilindrata() {
        return Cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        Cilindrata = cilindrata;
    }

    public Date getAnno() {
        return Anno;
    }

    public void setAnno(Date anno) {
        Anno = anno;
    }

    public String getEuro() {
        return Euro;
    }

    public void setEuro(String euro) {
        Euro = euro;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "ID=" + ID +
                ", Marca='" + Marca + '\'' +
                ", Modello='" + Modello + '\'' +
                ", Cilindrata=" + Cilindrata +
                ", Anno=" + Anno +
                ", Euro='" + Euro + '\'' +
                '}';
    }
}
