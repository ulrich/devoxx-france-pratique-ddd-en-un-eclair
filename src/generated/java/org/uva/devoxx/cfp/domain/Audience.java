package org.uva.devoxx.cfp.domain;

import java.io.Serializable;

/**
* Enum for Audience
*/
public enum Audience implements Serializable {
    DEBUTANT,
    CONFIRME,
    EXPERT;

    /**
     */
    private Audience() {
    }

    public String getName() {
        return name();
    }
}
