
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
@Table(name = "tbl_Agent")
public class Agent implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeAgent")
    private Long codeAgent;
    
    @Column(name = "agentName")
    private String agentName;
    
    @Column(name = "agentPhone")
    private String agentPhone;
    
    @Column(name = "agentEmail")
    private String agentEmail;
    
    @Column(name = "agentComments")
    private String agentComments;
    
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
    
    @Column(name = "targetMeetings")
    private long targetMeetings;
    
    @Column(name = "targetNumOfSales")
    private long targetNumOfSales;
    
    @Column(name = "targetTotalSales")
    private long targetTotalSales;

    public Long getCodeAgent() {
        return codeAgent;
    }

    public void setCodeAgent(Long codeAgent) {
        this.codeAgent = codeAgent;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public String getAgentEmail() {
        return agentEmail;
    }

    public void setAgentEmail(String agentEmail) {
        this.agentEmail = agentEmail;
    }

    public String getAgentComments() {
        return agentComments;
    }

    public void setAgentComments(String agentComments) {
        this.agentComments = agentComments;
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

    public long getTargetMeetings() {
        return targetMeetings;
    }

    public void setTargetMeetings(long targetMeetings) {
        this.targetMeetings = targetMeetings;
    }

    public long getTargetNumOfSales() {
        return targetNumOfSales;
    }

    public void setTargetNumOfSales(long targetNumOfSales) {
        this.targetNumOfSales = targetNumOfSales;
    }

    public long getTargetTotalSales() {
        return targetTotalSales;
    }

    public void setTargetTotalSales(long targetTotalSales) {
        this.targetTotalSales = targetTotalSales;
    }

}
