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
@Table(name = "tbl_PropertyType")
public class PropertyType implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codePropertyType")
    private Long codePropertyType;
    
    @Column(name = "descPropertyType")
    private String descPropertyType;

    public Long getCodePropertyType() {
        return codePropertyType;
    }

    public void setCodePropertyType(Long codePropertyType) {
        this.codePropertyType = codePropertyType;
    }

    public String getDescPropertyType() {
        return descPropertyType;
    }

    public void setDescPropertyType(String descPropertyType) {
        this.descPropertyType = descPropertyType;
    }
    
    
}
