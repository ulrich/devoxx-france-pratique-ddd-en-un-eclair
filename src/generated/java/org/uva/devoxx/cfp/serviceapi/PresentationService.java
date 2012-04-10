package org.uva.devoxx.cfp.serviceapi;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.uva.devoxx.cfp.domain.Presentation;

import java.util.List;

/**
 * Generated interface for the Service PresentationService.
 */
public interface PresentationService {
    public static final String BEAN_ID = "presentationService";

    public Presentation save(ServiceContext ctx, Presentation entity);

    public void delete(ServiceContext ctx, Presentation entity);

    public List<Presentation> findAll(ServiceContext ctx);

    public Presentation findById(ServiceContext ctx, Integer id)
        throws org.uva.devoxx.cfp.exception.PresentationNotFoundException;

    public List<Presentation> findBySujet(ServiceContext ctx, String terme);
}
