package com.example.echoapp.user;


import java.util.UUID;

public class User {

    private int ID;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private int immobili;
    private int utenze;
    private int auto;

    public User(int ID, String nome, String cognome, int immobili, int utenze, int auto) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
    }

    public User(int ID, String nome, String cognome, String email, String password) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
    }

    public User(int ID, String nome, String cognome, String email, String password, int immobili, int utenze, int auto) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.immobili = immobili;
        this.utenze = utenze;
        this.auto = auto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }



    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", immobili=" + immobili +
                ", utenze=" + utenze +
                ", auto=" + auto +
                '}';
    }
}
