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
@Table(name = "tbl_PriceRange")
public class PriceRange implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codePriceRange")
    private Long codePriceRange;
    
    @Column(name = "descPriceRange")
    private String descPriceRange;

    public Long getCodePriceRange() {
        return codePriceRange;
    }

    public void setCodePriceRange(Long codePriceRange) {
        this.codePriceRange = codePriceRange;
    }

    public String getDescPriceRange() {
        return descPriceRange;
    }

    public void setDescPriceRange(String descPriceRange) {
        this.descPriceRange = descPriceRange;
    }
    
    
    
}
