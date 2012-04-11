package org.uva.devoxx.cfp.serviceapi;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.fornax.cartridges.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.uva.devoxx.cfp.domain.Audience;
import org.uva.devoxx.cfp.domain.Format;
import org.uva.devoxx.cfp.domain.Langue;
import org.uva.devoxx.cfp.domain.Presentation;
import org.uva.devoxx.cfp.domain.PresentationBuilder;
import org.uva.devoxx.cfp.domain.Sujet;
import org.uva.devoxx.cfp.domain.Theme;
import org.uva.devoxx.cfp.exception.PresentationNotFoundException;

/**
 * Spring based transactional test with DbUnit support.
 */
public class PresentationServiceTest extends AbstractDbUnitJpaTests implements
		PresentationServiceTestBase {
	@Autowired
	protected PresentationService presentationService;

	@Test
	public void testSave() throws Exception {
		Sujet sujet = new Sujet();
		sujet.setTitre("Playframework c'est cool!");
		sujet.setResume("Playframework c'est cool!");
		sujet.setTheme(Theme.JAVA_JEE_ARCHITECTURE);

		Presentation presentation = PresentationBuilder.presentation().sujet(sujet).build();
		presentation.setFormat(Format.CONFERENCE);
		presentation.setAudience(Audience.DEBUTANT);
		presentation.setLangue(Langue.FR);

		presentationService.save(getServiceContext(), presentation);

		// test si l'on trouve nos deux présentations en base

		List<Presentation> allPresentation = presentationService.findAll(getServiceContext());

		assertNotNull(allPresentation);
		assertTrue(allPresentation.size() == 2);
	}

	@Test
	public void testDelete() throws Exception {
		Presentation sujetWithID1 = presentationService.findById(
				getServiceContext(), 1);

		assertNotNull(sujetWithID1);

		presentationService.delete(getServiceContext(), sujetWithID1);

		try {
			presentationService.findById(getServiceContext(), 1);
			fail("Doit envoyer une exception car il n'existe plus de présentation avec ID=1");
		} catch (Exception e) {
			assertNotNull(PresentationNotFoundException.class.isAssignableFrom(e.getClass()));
		}
	}

	@Test
	public void testFindAll() throws Exception {
		List<Presentation> allPresentation = presentationService.findAll(getServiceContext());

		assertNotNull(allPresentation);
		assertTrue(allPresentation.size() > 0);
	}

	@Test
	public void testFindById() throws Exception {
		Presentation sujetWithID = presentationService.findById(getServiceContext(), 1);

		assertNotNull(sujetWithID);
	}

	@Test
	public void testFindBySujet() throws Exception {
		List<Presentation> sujetWithDDD = presentationService.findBySujet(getServiceContext(), "DDD");

		assertNotNull(sujetWithDDD);
		assertTrue(sujetWithDDD.size() > 0);
	}

	@Test
	public void chercher_un_sujet_inconnu_doit_renvoyer_une_liste_vide() throws Exception {
		List<Presentation> sujetWithDDD = presentationService.findBySujet(getServiceContext(), "foobar");

		assertNotNull(sujetWithDDD);
		assertEquals(0, sujetWithDDD.size());
	}
}
