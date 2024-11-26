package isetb.pi.quizzproo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "responsablerh")
public class responsablerh implements Serializable {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  
    private String nom;


    private String prenom;

    private String email;
    
 
    private String password;


    private String num;

   
    private String adresse;
    
    @Temporal(TemporalType.DATE)
    private Date datenaissance;

    // Default constructor
    public responsablerh() {}

    // Constructor with fields
    public responsablerh(String nom, String prenom,  String email,String password, String num , String adresse ,Date datenaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.num = num;
        this.adresse = adresse;
        this.datenaissance = datenaissance;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
    
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public Date getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    // Optional: toString method
    @Override
    public String toString() {
        return "responsablerh{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                 ", email='" + email + '\'' +
                ", password='" + password + '\'' +
               ", num='" + num + '\'' +
                ", adresse='" + adresse + '\'' +
                ", datenaissance=" + datenaissance +
                '}';
    }
}
