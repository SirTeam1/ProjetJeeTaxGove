/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author User
 */
@Entity
public class Utilisateur extends Employe implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFiscale;
    private int droitFiscale;//1 , 2 , 3
    private String motDePasse;

    public Long getIdFiscale() {
        return idFiscale;
    }

    public void setIdFiscale(Long idFiscale) {
        this.idFiscale = idFiscale;
    }

    public Utilisateur() {
    }

    public Utilisateur(Long idFiscale) {
        this.idFiscale = idFiscale;
    }

    public Utilisateur(int droitFiscale, String motDePasse) {
        this.droitFiscale = droitFiscale;
        this.motDePasse = motDePasse;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public int getDroitFiscale() {
        return droitFiscale;
    }

    public void setDroitFiscale(int droitFiscale) {
        this.droitFiscale = droitFiscale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFiscale != null ? idFiscale.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idFiscale == null && other.idFiscale != null) || (this.idFiscale != null && !this.idFiscale.equals(other.idFiscale))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Utilisateur{" + "idFiscale=" + idFiscale + ", droitFiscale=" + droitFiscale + ", motDePasse=" + motDePasse + '}';
    }

}
