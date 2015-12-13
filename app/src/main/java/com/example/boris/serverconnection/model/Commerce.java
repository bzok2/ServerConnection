package com.example.boris.serverconnection.model;

/**
 * Created by boris on 12/12/2015.
 */
public class Commerce {

    private String nom;
    private String description;
    private String libelleType;
    private String latitude;
    private String longitude;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Commerce{" +
                "nom='" + nom + '\'' +
                ", description=" + description +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }



}
