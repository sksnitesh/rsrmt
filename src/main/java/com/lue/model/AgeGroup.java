
package com.lue.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author
 */
@Entity
@Table(name = "tbl_AgeGroup")
public class AgeGroup implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeAgeGroup")
    private Long codeAgeGroup;
    
    @Column(name = "descAgeGroup")
    private String descAgeGroup;

    public Long getCodeAgeGroup() {
        return codeAgeGroup;
    }

    public void setCodeAgeGroup(Long codeAgeGroup) {
        this.codeAgeGroup = codeAgeGroup;
    }

    public String getDescAgeGroup() {
        return descAgeGroup;
    }

    public void setDescAgeGroup(String descAgeGroup) {
        this.descAgeGroup = descAgeGroup;
    }
    
    
}
