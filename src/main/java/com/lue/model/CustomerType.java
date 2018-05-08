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
@Table(name = "tbl_CustomerType")
public class CustomerType implements Serializable {
 
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeCustomerType")
    private Long codeCustomerType;
    
    @Column(name = "descCustomerType")
    private String descCustomerType;

    public Long getCodeCustomerType() {
        return codeCustomerType;
    }

    public void setCodeCustomerType(Long codeCustomerType) {
        this.codeCustomerType = codeCustomerType;
    }

    public String getDescCustomerType() {
        return descCustomerType;
    }

    public void setDescCustomerType(String descCustomerType) {
        this.descCustomerType = descCustomerType;
    }
    
    
}
