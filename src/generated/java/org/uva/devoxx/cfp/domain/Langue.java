package org.uva.devoxx.cfp.domain;

import java.io.Serializable;

/**
* Enum for Langue
*/
public enum Langue implements Serializable {
    FR,
    EN;

    /**
     */
    private Langue() {
    }

    public String getName() {
        return name();
    }
}
