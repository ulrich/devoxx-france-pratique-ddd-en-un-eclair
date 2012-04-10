package org.uva.devoxx.cfp.domain;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;
import org.fornax.cartridges.sculptor.framework.domain.Auditable;

import java.lang.reflect.Field;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

/**
* Entity representing Presentation.
*/
@Entity
@Table(name = "PRESENTATION")
@EntityListeners({org.fornax.cartridges.sculptor.framework.domain.AuditListener.class
})
public class Presentation extends AbstractDomainObject implements Auditable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "CREATEDDATE")
    private Date createdDate;
    @Column(name = "CREATEDBY", length = 50)
    private String createdBy;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name = "LASTUPDATED")
    private Date lastUpdated;
    @Column(name = "LASTUPDATEDBY", length = 50)
    private String lastUpdatedBy;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;
    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "titre",column = @Column(name = "SUJET_TITRE",nullable = false,length = 100)
        )
        , @AttributeOverride(name = "resume",column = @Column(name = "SUJET_RESUME",nullable = false,length = 100)
        )
        , @AttributeOverride(name = "theme",column = @Column(name = "SUJET_THEME",nullable = false,length = 21)
        )
    })
    @NotNull
    private Sujet sujet;
    @Column(name = "FORMAT", nullable = false, length = 16)
    @Enumerated(javax.persistence.EnumType.STRING)
    @NotNull
    private Format format;
    @Column(name = "AUDIENCE", length = 8)
    @Enumerated(javax.persistence.EnumType.STRING)
    private Audience audience;
    @Column(name = "LANGUE", length = 2)
    @Enumerated(javax.persistence.EnumType.STRING)
    private Langue langue;

    public Presentation() {
    }

    public Integer getId() {
        return id;
    }

    /**
     * The id is not intended to be changed or assigned manually, but
     * for test purpose it is allowed to assign the id.
     */
    protected void setId(Integer id) {
        if ((this.id != null) && !this.id.equals(id)) {
            throw new IllegalArgumentException(
                "Not allowed to change the id property.");
        }
        this.id = id;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public void setSujet(Sujet sujet) {
        this.sujet = sujet;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    /**
     * This method is used by toString. It specifies what to
     * include in the toString result.
     * @return true if the field is to be included in toString
     */
    protected boolean acceptToString(Field field) {
        if (super.acceptToString(field)) {
            return true;
        } else {
            if (field.getName().equals("sujet")) {
                return true;
            }

            if (field.getName().equals("format")) {
                return true;
            }

            if (field.getName().equals("audience")) {
                return true;
            }

            if (field.getName().equals("langue")) {
                return true;
            }
            return false;
        }
    }

    /**
     * This method is used by equals and hashCode.
     * @return {@link #getId}
     */
    public Object getKey() {
        return getId();
    }

    // This comment was generated from SpecialCases.xpt 
}
