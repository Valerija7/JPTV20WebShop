/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class History implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.DETACH)
    private User user;
    @OneToOne(cascade = CascadeType.DETACH)
    private Product product;
    @Temporal(TemporalType.TIMESTAMP)
    private Date buy;
    private double gain;

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }
    
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setModel(Product model) {
        this.product = product;
    }

    public Date getBuy() {
        return buy;
    }

    public void setBuy(Date buy) {
        this.buy = buy;
    }

    public double getGain() {
        return gain;
    }

    public void setGain(double gain) {
        this.gain = gain;
    }
    
    @Override
    public String toString() {
        return "History{" + "id=" + id + ", user=" + user + ", product=" + product + ", buy=" + buy + ", gain=" + gain +'}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.user);
        hash = 83 * hash + Objects.hashCode(this.product);
        hash = 83 * hash + Objects.hashCode(this.buy);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.gain) ^ (Double.doubleToLongBits(this.gain) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final History other = (History) obj;
        if (Double.doubleToLongBits(this.gain) != Double.doubleToLongBits(other.gain)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        if (!Objects.equals(this.buy, other.buy)) {
            return false;
        }
        return true;
    }

}