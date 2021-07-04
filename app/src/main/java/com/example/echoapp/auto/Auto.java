package com.example.echoapp.auto;

import java.util.Date;

public class Auto {

    private String Marca;
    private String Modello;
    private int Cilindrata;
    private Date Anno;
    private String Euro;

    public Auto(String marca, String modello, int cilindrata, Date anno, String euro) {
        Marca = marca;
        Modello = modello;
        Cilindrata = cilindrata;
        Anno = anno;
        Euro = euro;
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
                "Marca='" + Marca + '\'' +
                ", Modello='" + Modello + '\'' +
                ", Cilindrata=" + Cilindrata +
                ", Anno=" + Anno +
                ", Euro='" + Euro + '\'' +
                '}';
    }


}
