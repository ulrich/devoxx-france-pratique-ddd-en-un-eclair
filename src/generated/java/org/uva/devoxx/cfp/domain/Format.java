package org.uva.devoxx.cfp.domain;

import java.io.Serializable;

/**
* Enum for Format
*/
public enum Format implements Serializable {
    UNIVERSITE(240),
    CONFERENCE(60),
    OUTILS_EN_ACTION(30),
    SUR_LE_POUCE(15);
    private Integer temps;

    /**
     */
    private Format(Integer temps) {
        this.temps = temps;
    }

    public Integer getTemps() {
        return temps;
    }

    public String getName() {
        return name();
    }
}
