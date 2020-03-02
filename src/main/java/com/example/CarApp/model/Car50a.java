package com.example.CarApp.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Car50a {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "nr_sprawy")
    @NotNull
    private String nrSprawy;

    @Column(name = "marka_pojazdu")
    @NotNull
    private String markaPojazdu;

    @Column(name = "nr_rejestracyjny")
    @NotNull
    private String nrRejestracyjny;

    @Column(name = "wlasciciel")
    @NotNull
    private String wlasciciel;
//    private String pismo;
//    private String dataPisma;
//    private String usunięcie;
//    private String przejecie;
//    private String status;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getNrSprawy() {
        return nrSprawy;
    }

    public void setNrSprawy(String nrSprawy) {
        this.nrSprawy = nrSprawy;
    }

    public String getMarkaPojazdu() {
        return markaPojazdu;
    }

    public void setMarkaPojazdu(String markaPojazdu) {
        this.markaPojazdu = markaPojazdu;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

//    public String getPismo() {
//        return pismo;
//    }
//
//    public void setPismo(String pismo) {
//        this.pismo = pismo;
//    }
//
//    public String getDataPisma() {
//        return dataPisma;
//    }
//
//    public void setDataPisma(String dataPisma) {
//        this.dataPisma = dataPisma;
//    }
//
//    public String getUsunięcie() {
//        return usunięcie;
//    }
//
//    public void setUsunięcie(String usunięcie) {
//        this.usunięcie = usunięcie;
//    }
//
//    public String getPrzejecie() {
//        return przejecie;
//    }
//
//    public void setPrzejecie(String przejecie) {
//        this.przejecie = przejecie;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }

    @Override
    public String toString() {
        return "Car50a{" +
                "Id=" + Id +
                ", nrSprawy='" + nrSprawy + '\'' +
                ", markaPojazdu='" + markaPojazdu + '\'' +
                ", nrRejestracyjny='" + nrRejestracyjny + '\'' +
                ", wlasciciel='" + wlasciciel + '\'' +
                '}';
    }
}
