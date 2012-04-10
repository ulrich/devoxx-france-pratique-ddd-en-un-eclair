package org.uva.devoxx.cfp.serviceimpl;

import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.uva.devoxx.cfp.domain.Presentation;
import org.uva.devoxx.cfp.domain.PresentationRepository;
import org.uva.devoxx.cfp.exception.PresentationNotFoundException;
import org.uva.devoxx.cfp.serviceapi.PresentationService;

import java.util.List;

/**
* Implementation of PresentationService.
*/
@Service("presentationService")
public class PresentationServiceImpl implements PresentationService {
    @Autowired
    private PresentationRepository presentationRepository;

    public PresentationServiceImpl() {
    }

    protected PresentationRepository getPresentationRepository() {
        return presentationRepository;
    }

    /**
     * Delegates to {@link org.uva.devoxx.cfp.domain.PresentationRepository#save}
     */
    public Presentation save(ServiceContext ctx, Presentation entity) {
        return presentationRepository.save(entity);

    }

    /**
     * Delegates to {@link org.uva.devoxx.cfp.domain.PresentationRepository#delete}
     */
    public void delete(ServiceContext ctx, Presentation entity) {
        presentationRepository.delete(entity);

    }

    /**
     * Delegates to {@link org.uva.devoxx.cfp.domain.PresentationRepository#findAll}
     */
    public List<Presentation> findAll(ServiceContext ctx) {
        return presentationRepository.findAll();

    }

    /**
     * Delegates to {@link org.uva.devoxx.cfp.domain.PresentationRepository#findById}
     */
    public Presentation findById(ServiceContext ctx, Integer id)
        throws PresentationNotFoundException {
        return presentationRepository.findById(id);

    }

    /**
     * Delegates to {@link org.uva.devoxx.cfp.domain.PresentationRepository#findBySujet}
     */
    public List<Presentation> findBySujet(ServiceContext ctx, String terme) {
        return presentationRepository.findBySujet(terme);

    }
}
