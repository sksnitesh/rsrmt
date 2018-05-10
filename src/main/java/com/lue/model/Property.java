package com.lue.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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

    @Column(name = "descProperty")
    private String descProperty;

    @Column(name = "property")
    private String property;

    @Column(name = "price")
    private Double price;

    @Column(name = "priceRange")
    private String priceRange;

    @Column(name = "propertyStatus")
    private String propertyStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeAgent", referencedColumnName = "codeAgent")})
    private Agent codeAgent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeCustomer", referencedColumnName = "codeCustomer")})
    private Customers codeCustomer;

    @Column(name = "unitInternalCode")
    private String unitInternalCode;

    @Column(name = "commments")
    private String comments;

    @Column(name = "address")
    private String address;

    @Column(name = "ValueForPerformance")
    private String ValueForPerformance;

    public Long getCodeProperty() {
        return codeProperty;
    }

    public void setCodeProperty(Long codeProperty) {
        this.codeProperty = codeProperty;
    }

    public String getDescProperty() {
        return descProperty;
    }

    public void setDescProperty(String descProperty) {
        this.descProperty = descProperty;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(String priceRange) {
        this.priceRange = priceRange;
    }

    public String getPropertyStatus() {
        return propertyStatus;
    }

    public void setPropertyStatus(String propertyStatus) {
        this.propertyStatus = propertyStatus;
    }

    public Agent getCodeAgent() {
        return codeAgent;
    }

    public void setCodeAgent(Agent codeAgent) {
        this.codeAgent = codeAgent;
    }

    public Customers getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(Customers codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getUnitInternalCode() {
        return unitInternalCode;
    }

    public void setUnitInternalCode(String unitInternalCode) {
        this.unitInternalCode = unitInternalCode;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getValueForPerformance() {
        return ValueForPerformance;
    }

    public void setValueForPerformance(String ValueForPerformance) {
        this.ValueForPerformance = ValueForPerformance;
    }

    
    

}
