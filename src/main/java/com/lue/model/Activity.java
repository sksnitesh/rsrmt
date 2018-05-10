package com.lue.model;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author
 */
@Entity
@Table(name = "tbl_activity")
public class Activity implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
    @JoinColumn(name = "codeActivityType", referencedColumnName = "codeActivity")})
    private ActivityType codeActivityType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
    @JoinColumn(name = "codeAgent", referencedColumnName = "codeAgent")})
    private Agent codeAgent;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
    @JoinColumn(name = "codeCustomer", referencedColumnName = "codeCustomer")})
    private Customers codesCutomer;
  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
    @JoinColumn(name = "codeProperty", referencedColumnName = "codeProperty")})
    private Property codeProperty;
    
    @Column(name = "dealDate")
    @Temporal(TemporalType.DATE)
    private Date dealDate;
    
    @Column(name = "joinPaperYes")
    private boolean joinPaperYes;
    
    @Column(name = "joinPaperDate")
    @Temporal(TemporalType.DATE)
    private Date joinPaperDate;
    
    @Column(name = "comments")
    private String comments;
    
    @Column(name = "units")
    private long units;
    
    @Column(name = "unitPrice")
    private long unitPrice;
    
    @Column(name = "totalPrice")
    private long totalPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ActivityType getCodeActivityType() {
        return codeActivityType;
    }

    public void setCodeActivityType(ActivityType codeActivityType) {
        this.codeActivityType = codeActivityType;
    }

    public Agent getCodeAgent() {
        return codeAgent;
    }

    public void setCodeAgent(Agent codeAgent) {
        this.codeAgent = codeAgent;
    }

    public Customers getCodesCutomer() {
        return codesCutomer;
    }

    public void setCodesCutomer(Customers codesCutomer) {
        this.codesCutomer = codesCutomer;
    }

    public Property getCodeProperty() {
        return codeProperty;
    }

    public void setCodeProperty(Property codeProperty) {
        this.codeProperty = codeProperty;
    }

    public Date getDealDate() {
        return dealDate;
    }

    public void setDealDate(Date dealDate) {
        this.dealDate = dealDate;
    }

    public boolean isJoinPaperYes() {
        return joinPaperYes;
    }

    public void setJoinPaperYes(boolean joinPaperYes) {
        this.joinPaperYes = joinPaperYes;
    }

    public Date getJoinPaperDate() {
        return joinPaperDate;
    }

    public void setJoinPaperDate(Date joinPaperDate) {
        this.joinPaperDate = joinPaperDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getUnits() {
        return units;
    }

    public void setUnits(long units) {
        this.units = units;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
    
     
}
