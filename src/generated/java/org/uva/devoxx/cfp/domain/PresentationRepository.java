package org.uva.devoxx.cfp.domain;

import java.util.List;

/**
 * Generated interface for Repository for Presentation
 */
public interface PresentationRepository {
    public static final String BEAN_ID = "presentationRepository";

    public List<Presentation> findBySujet(String terme);

    public Presentation save(Presentation entity);

    public void delete(Presentation entity);

    public List<Presentation> findAll();

    public Presentation findById(Integer id)
        throws org.uva.devoxx.cfp.exception.PresentationNotFoundException;
}
