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
@Table(name = "tbl_activityType")
public class ActivityType implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeActivity")
    private Long codeActivity;
    
    @Column(name = "descActivity")
    private String descActivity;

    public Long getCodeActivity() {
        return codeActivity;
    }

    public void setCodeActivity(Long codeActivity) {
        this.codeActivity = codeActivity;
    }

    public String getDescActivity() {
        return descActivity;
    }

    public void setDescActivity(String descActivity) {
        this.descActivity = descActivity;
    }
    
    
    
}
