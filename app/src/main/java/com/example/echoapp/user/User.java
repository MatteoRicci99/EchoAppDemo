package com.example.echoapp.user;

import com.example.echoapp.auto.Auto;

import java.util.Date;
import java.util.List;

public class User {

    private String nome;
    private String cognome;
    private Date annoNascita;
    private String email;
    private String password;
    private int immobili;
    private int utenze;
    private List<Auto> auto;

    public User(String nome, String cognome, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public User(String nome, String cognome, Date annoNascita, String email, String password, int immobili, int utenze, List<Auto> auto) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.email = email;
        this.password = password;
        this.immobili = immobili;
        this.utenze = utenze;
        this.auto = auto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(Date annoNascita) {
        this.annoNascita = annoNascita;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getImmobili() {
        return immobili;
    }

    public void setImmobili(int immobili) {
        this.immobili = immobili;
    }

    public int getUtenze() {
        return utenze;
    }

    public void setUtenze(int utenze) {
        this.utenze = utenze;
    }

    public List<Auto> getAuto() {
        return auto;
    }

    public void setAuto(List<Auto> auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", annoNascita=" + annoNascita +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", immobili=" + immobili +
                ", utenze=" + utenze +
                ", auto=" + auto +
                '}';
    }
}
