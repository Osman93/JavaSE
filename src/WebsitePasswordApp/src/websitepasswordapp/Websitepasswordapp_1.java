/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websitepasswordapp;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Osman Aşar
 */
@Entity
@Table(name = "WEBSITEPASSWORDAPP", catalog = "", schema = "OSMAN")
@NamedQueries({
    @NamedQuery(name = "Websitepasswordapp_1.findAll", query = "SELECT w FROM Websitepasswordapp_1 w"),
    @NamedQuery(name = "Websitepasswordapp_1.findById", query = "SELECT w FROM Websitepasswordapp_1 w WHERE w.id = :id"),
    @NamedQuery(name = "Websitepasswordapp_1.findByWebsitename", query = "SELECT w FROM Websitepasswordapp_1 w WHERE w.websitename = :websitename"),
    @NamedQuery(name = "Websitepasswordapp_1.findByUsername", query = "SELECT w FROM Websitepasswordapp_1 w WHERE w.username = :username"),
    @NamedQuery(name = "Websitepasswordapp_1.findByPassword", query = "SELECT w FROM Websitepasswordapp_1 w WHERE w.password = :password")})
public class Websitepasswordapp_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "WEBSITENAME")
    private String websitename;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;

    public Websitepasswordapp_1() {
    }

    public Websitepasswordapp_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getWebsitename() {
        return websitename;
    }

    public void setWebsitename(String websitename) {
        String oldWebsitename = this.websitename;
        this.websitename = websitename;
        changeSupport.firePropertyChange("websitename", oldWebsitename, websitename);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Websitepasswordapp_1)) {
            return false;
        }
        Websitepasswordapp_1 other = (Websitepasswordapp_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "websitepasswordapp.Websitepasswordapp_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
