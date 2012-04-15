package org.uva.devoxx.cfp.repositoryimpl;

import org.springframework.stereotype.Repository;

import org.uva.devoxx.cfp.domain.Presentation;

import java.util.List;

/**
 * Repository implementation for Presentation
 */
@Repository("presentationRepository")
public class PresentationRepositoryImpl extends PresentationRepositoryBase {
    public PresentationRepositoryImpl() {
    }

    public List<Presentation> findBySujet(String terme) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("findBySujet not implemented");

    }
}
