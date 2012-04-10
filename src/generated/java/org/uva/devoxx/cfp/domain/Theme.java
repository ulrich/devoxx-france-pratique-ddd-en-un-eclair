package org.uva.devoxx.cfp.domain;

import java.io.Serializable;

/**
* Enum for Theme
*/
public enum Theme implements Serializable {
    WEB,
    MOBILE,
    LANGAGES_ALTERNATIFS,
    PRATIQUE_ENTREPRISE,
    JAVA_JEE_ARCHITECTURE;

    /**
     */
    private Theme() {
    }

    public String getName() {
        return name();
    }
}
