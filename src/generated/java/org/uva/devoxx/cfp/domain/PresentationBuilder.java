package org.uva.devoxx.cfp.domain;

import java.util.Date;

/**
  * Builder for Presentation class.
  */
public class PresentationBuilder {
    private Date createdDate;
    private String createdBy;
    private Date lastUpdated;
    private String lastUpdatedBy;
    private Sujet sujet;
    private Format format;
    private Audience audience;
    private Langue langue;

    public PresentationBuilder() {
    }

    /**
     * Static factor method for PresentationBuilder
     */
    public static PresentationBuilder presentation() {
        return new PresentationBuilder();
    }

    public PresentationBuilder createdDate(Date val) {
        this.createdDate = val;
        return this;
    }

    public PresentationBuilder createdBy(String val) {
        this.createdBy = val;
        return this;
    }

    public PresentationBuilder lastUpdated(Date val) {
        this.lastUpdated = val;
        return this;
    }

    public PresentationBuilder lastUpdatedBy(String val) {
        this.lastUpdatedBy = val;
        return this;
    }

    public PresentationBuilder sujet(Sujet sujet) {
        this.sujet = sujet;
        return this;
    }

    public PresentationBuilder format(Format format) {
        this.format = format;
        return this;
    }

    public PresentationBuilder audience(Audience audience) {
        this.audience = audience;
        return this;
    }

    public PresentationBuilder langue(Langue langue) {
        this.langue = langue;
        return this;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public Sujet getSujet() {
        return sujet;
    }

    public Format getFormat() {
        return format;
    }

    public Audience getAudience() {
        return audience;
    }

    public Langue getLangue() {
        return langue;
    }

    /**
     * @return new Presentation instance constructed based on the values that have been set into this builder
     */
    public Presentation build() {
        Presentation obj = new Presentation();

        obj.setCreatedDate(createdDate);

        obj.setCreatedBy(createdBy);

        obj.setLastUpdated(lastUpdated);

        obj.setLastUpdatedBy(lastUpdatedBy);

        obj.setSujet(sujet);

        obj.setFormat(format);

        obj.setAudience(audience);

        obj.setLangue(langue);

        return obj;
    }
}
