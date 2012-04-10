package org.uva.devoxx.cfp.domain;

import org.fornax.cartridges.sculptor.framework.domain.AbstractDomainObject;

import java.lang.reflect.Field;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Enumerated;

import javax.validation.constraints.NotNull;

/**
* BasicType representing Sujet.
*/
@Embeddable
public class Sujet extends AbstractDomainObject {
    private static final long serialVersionUID = 1L;
    @Column(name = "TITRE", nullable = false, length = 100)
    @NotNull
    private String titre;
    @Column(name = "RESUME", nullable = false, length = 100)
    @NotNull
    private String resume;
    @Column(name = "THEME", nullable = false, length = 21)
    @Enumerated(javax.persistence.EnumType.STRING)
    @NotNull
    private Theme theme;

    public Sujet() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
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
            if (field.getName().equals("theme")) {
                return true;
            }
            return false;
        }
    }

    // This comment was generated from SpecialCases.xpt 
}
