package fr.epsi.workshop2021.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "info_recupere")
public class InfoRecup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "identifiant")
    private String identifiant;

    @Column(name = "password")
    private String password;

    @Column(name = "ip_adress")
    private String IPadress;

    @Column(name = "date")
    private Date date;

    public InfoRecup() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIPadress() {
        return IPadress;
    }

    public void setIPadress(String IPadress) {
        this.IPadress = IPadress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
