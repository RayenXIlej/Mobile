/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entities;

/**
 *
 * @author Rayen
 */
public class Utilisateur {
    private int id;
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private int acces;
    private int bloque;
    private String type;
    private String adresse;
    private String numtel;

    public Utilisateur() {
    }
    

    public Utilisateur(int id, String email, String password, String nom, String prenom, int acces, int bloque, String type, String adresse, String numtel) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.acces = acces;
        this.bloque = bloque;
        this.type = type;
        this.adresse = adresse;
        this.numtel = numtel;
    }

    public Utilisateur(String email, String password, String nom, String prenom, int acces, int bloque, String type, String adresse, String numtel) {
        this.email = email;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.acces = acces;
        this.bloque = bloque;
        this.type = type;
        this.adresse = adresse;
        this.numtel = numtel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAcces() {
        return acces;
    }

    public void setAcces(int acces) {
        this.acces = acces;
    }

    public int getBloque() {
        return bloque;
    }

    public void setBloque(int bloque) {
        this.bloque = bloque;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumtel() {
        return numtel;
    }

    public void setNumtel(String numtel) {
        this.numtel = numtel;
    }
    
    
}

