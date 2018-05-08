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
@Table(name = "tbl_Lang")
public class Lang implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "codeLang")
    private Long codeLang;
    
    @Column(name = "descLang")
    private String descLang;

    public Long getCodeLang() {
        return codeLang;
    }

    public void setCodeLang(Long codeLang) {
        this.codeLang = codeLang;
    }

    public String getDescLang() {
        return descLang;
    }

    public void setDescLang(String descLang) {
        this.descLang = descLang;
    }
    
    
}
