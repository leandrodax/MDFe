/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFirebird;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vplayer
 */
public class Config implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer identifyThreshold;
    private Integer identifyRotationTolerance;
    private Integer verifyThreshold;
    private Integer verifyRotationTolerance;

    public Config() {
    }

    public Config(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentifyThreshold() {
        return identifyThreshold;
    }

    public void setIdentifyThreshold(Integer identifyThreshold) {
        this.identifyThreshold = identifyThreshold;
    }

    public Integer getIdentifyRotationTolerance() {
        return identifyRotationTolerance;
    }

    public void setIdentifyRotationTolerance(Integer identifyRotationTolerance) {
        this.identifyRotationTolerance = identifyRotationTolerance;
    }

    public Integer getVerifyThreshold() {
        return verifyThreshold;
    }

    public void setVerifyThreshold(Integer verifyThreshold) {
        this.verifyThreshold = verifyThreshold;
    }

    public Integer getVerifyRotationTolerance() {
        return verifyRotationTolerance;
    }

    public void setVerifyRotationTolerance(Integer verifyRotationTolerance) {
        this.verifyRotationTolerance = verifyRotationTolerance;
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
        if (!(object instanceof Config)) {
            return false;
        }
        Config other = (Config) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClassesFirebird.Config[ id=" + id + " ]";
    }
    
}
