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
@Table(name = "tbl_customers")
public class Customers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeCustomer")
    private Long codeCustomer;

    @Column(name = "customerName")
    private String customerName;

    @Column(name = "customerPhone")
    private String customerPhone;

    @Column(name = "customerEmail")
    private String customerEmail;

    @Column(name = "customerComments")
    private String customerComments;

    @Column(name = "customer")
    private String customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeAgeGroup", referencedColumnName = "codeAgeGroup")})
    private AgeGroup codeAgeGroup;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeCustomerType", referencedColumnName = "codeCustomerType")})
    private CustomerType codeCustomerType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeFinance", referencedColumnName = "codeFinance")})
    private Finance codeFinance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeGender", referencedColumnName = "codeGender")})
    private Gender codeGender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codeLang", referencedColumnName = "codeLang")})
    private Lang codeLang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codePriceRange", referencedColumnName = "codePriceRange")})
    private PriceRange codePriceRange;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name = "codePropertyType", referencedColumnName = "codePropertyType")})
    private PropertyType codePropertyType;

    public Long getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(Long codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerComments() {
        return customerComments;
    }

    public void setCustomerComments(String customerComments) {
        this.customerComments = customerComments;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public AgeGroup getCodeAgeGroup() {
        return codeAgeGroup;
    }

    public void setCodeAgeGroup(AgeGroup codeAgeGroup) {
        this.codeAgeGroup = codeAgeGroup;
    }

    public CustomerType getCodeCustomerType() {
        return codeCustomerType;
    }

    public void setCodeCustomerType(CustomerType codeCustomerType) {
        this.codeCustomerType = codeCustomerType;
    }

    public Finance getCodeFinance() {
        return codeFinance;
    }

    public void setCodeFinance(Finance codeFinance) {
        this.codeFinance = codeFinance;
    }

    public Gender getCodeGender() {
        return codeGender;
    }

    public void setCodeGender(Gender codeGender) {
        this.codeGender = codeGender;
    }

    public Lang getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(Lang codeLang) {
        this.codeLang = codeLang;
    }

    public PriceRange getCodePriceRange() {
        return codePriceRange;
    }

    public void setCodePriceRange(PriceRange codePriceRange) {
        this.codePriceRange = codePriceRange;
    }

    public PropertyType getCodePropertyType() {
        return codePropertyType;
    }

    public void setCodePropertyType(PropertyType codePropertyType) {
        this.codePropertyType = codePropertyType;
    }

    

}
