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
@Table(name = "tbl_Finance")
public class Finance implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeFinance")
    private Long codeFinance;
    
    @Column(name = "descFinance")
    private String descFinance;

    public Long getCodeFinance() {
        return codeFinance;
    }

    public void setCodeFinance(Long codeFinance) {
        this.codeFinance = codeFinance;
    }

    public String getDescFinance() {
        return descFinance;
    }

    public void setDescFinance(String descFinance) {
        this.descFinance = descFinance;
    }
    
    
}
