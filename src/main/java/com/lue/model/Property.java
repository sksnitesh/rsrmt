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
@Table(name = "tbl_Property")
public class Property implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeProperty")
    private Long codeProperty;

    public Long getCodeProperty() {
        return codeProperty;
    }

    public void setCodeProperty(Long codeProperty) {
        this.codeProperty = codeProperty;
    }
    
    
    
}
