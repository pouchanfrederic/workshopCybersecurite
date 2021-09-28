package fr.epsi.workshop2021.model;
import javax.persistence.*;

@Entity
@Table(name = "global_info")
public class GlobalInfo {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "email_envoye")
    private Integer nbrEmailEnvoye;

    @Column(name = "connection_recup")
    private String nbrConnectionObtenu;

    public GlobalInfo() {
    }

    public Integer getNbrEmailEnvoye() {
        return nbrEmailEnvoye;
    }

    public void setNbrEmailEnvoye(Integer nbrEmailEnvoye) {
        this.nbrEmailEnvoye = nbrEmailEnvoye;
    }

    public String getNbrConnectionObtenu() {
        return nbrConnectionObtenu;
    }

    public void setNbrConnectionObtenu(String nbrConnectionObtenu) {
        this.nbrConnectionObtenu = nbrConnectionObtenu;
    }
}


