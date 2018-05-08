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
@Table(name = "tbl_Gender")
public class Gender implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeGender")
    private Long codeGender;
    
    @Column(name = "descGender")
    private String descGender;

    public Long getCodeGender() {
        return codeGender;
    }

    public void setCodeGender(Long codeGender) {
        this.codeGender = codeGender;
    }

    public String getDescGender() {
        return descGender;
    }

    public void setDescGender(String descGender) {
        this.descGender = descGender;
    }
    
    
    
}
