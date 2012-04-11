package org.uva.devoxx.cfp.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.uva.devoxx.cfp.domain.Presentation;

/**
 * Implementation of PresentationResource.
 */
@Controller
public class PresentationResource extends PresentationResourceBase {
    public PresentationResource() {
    }

    @RequestMapping(value = "/presentation/form", method = RequestMethod.GET)
    public String createForm(ModelMap modelMap) {
        Presentation entity = new Presentation();
        modelMap.addAttribute("entity", entity);
        return "presentation/create";

    }
}
