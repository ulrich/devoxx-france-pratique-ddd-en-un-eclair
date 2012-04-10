package org.uva.devoxx.cfp.repositoryimpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.uva.devoxx.cfp.domain.Presentation;
import org.uva.devoxx.cfp.domain.PresentationBuilder;
import org.uva.devoxx.cfp.domain.Sujet;

/**
 * Repository implementation for Presentation
 */
@Repository("presentationRepository")
public class PresentationRepositoryImpl extends PresentationRepositoryBase {
	public PresentationRepositoryImpl() {
	}

	public List<Presentation> findBySujet(String terme) {
		Sujet sujetExample = new Sujet();
		sujetExample.setTitre("%" + terme + "%");

		Presentation presentationExample = PresentationBuilder.presentation().sujet(sujetExample).build();

		return findByExample(presentationExample);
	}
}
