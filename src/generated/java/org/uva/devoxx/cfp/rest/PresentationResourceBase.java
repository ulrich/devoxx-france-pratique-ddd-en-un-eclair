package org.uva.devoxx.cfp.rest;

import org.fornax.cartridges.sculptor.framework.errorhandling.OptimisticLockingException;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContext;
import org.fornax.cartridges.sculptor.framework.errorhandling.ServiceContextStore;
import org.fornax.cartridges.sculptor.framework.errorhandling.SystemException;
import org.fornax.cartridges.sculptor.framework.errorhandling.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.uva.devoxx.cfp.domain.Presentation;
import org.uva.devoxx.cfp.exception.PresentationNotFoundException;
import org.uva.devoxx.cfp.serviceapi.PresentationService;

import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

/**
 * Generated base class for implementation of PresentationResource.
 * <p>Make sure that subclass defines the following annotations:
 * <pre>

@org.springframework.stereotype.Controller

 * </pre>
 */
public abstract class PresentationResourceBase {
    @Autowired
    private PresentationService presentationService;

    public PresentationResourceBase() {
    }

    protected ServiceContext serviceContext() {
        return ServiceContextStore.get();
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) throws Exception {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(false));

    }

    protected PresentationService getPresentationService() {
        return presentationService;
    }

    @RequestMapping(value = "/presentation/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id")
    Integer id, ModelMap modelMap) throws PresentationNotFoundException {
        Presentation result =
            presentationService.findById(serviceContext(), id);

        modelMap.addAttribute("result", result);

        return "/presentation/show";

    }

    @RequestMapping(value = "/presentation", method = RequestMethod.GET)
    public String showAll(ModelMap modelMap) {
        List<Presentation> result =
            presentationService.findAll(serviceContext());

        modelMap.addAttribute("result", result);

        return "/presentation/showlist";

    }

    @RequestMapping(value = "/presentation/search", method = RequestMethod.GET)
    public String searchBySujet() {
        return "/presentation/search";

    }

    @RequestMapping(value = "/presentation/searchsujet", method = RequestMethod.GET)
    public String showBySujet(@RequestParam("terme")
    String terme, ModelMap modelMap) {
        List<Presentation> result =
            presentationService.findBySujet(serviceContext(), terme);

        modelMap.addAttribute("result", result);

        return "/presentation/showlist";

    }

    @RequestMapping(value = "/presentation", method = RequestMethod.POST)
    public String create(@RequestBody
    Presentation entity) {
        Presentation result =
            presentationService.save(serviceContext(), entity);

        return String.format("redirect:/rest/presentation/%s", result.getId());

    }

    @RequestMapping(value = "/presentation/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id")
    Integer id) throws Exception {
        Presentation deleteObj =
            presentationService.findById(serviceContext(), id);
        presentationService.delete(serviceContext(), deleteObj);

        return "redirect:../presentation";

    }

    /*
    @RequestMapping(value = "/presentation/form", method=RequestMethod.GET)
    public  String createForm(ModelMap modelMap)
    */
    public abstract String createForm(ModelMap modelMap);

    /**
     * This method is needed for form data POST. Delegates to {@link #create}
     */
    @RequestMapping(value = "/presentation", method = RequestMethod.POST, headers = "content-type=application/x-www-form-urlencoded")
    public String createFromForm(@ModelAttribute("entity")
    Presentation entity) {
        return create(entity);
    }

    @ExceptionHandler
    public void handleException(PresentationNotFoundException e,
        HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.NOT_FOUND.value(), e.getMessage());
    }

    @ExceptionHandler
    public void handleException(IllegalArgumentException e,
        HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @ExceptionHandler
    public void handleException(ValidationException e,
        HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value(), e.getMessage());
    }

    @ExceptionHandler
    public void handleException(SystemException e, HttpServletResponse response)
        throws IOException {
        response.sendError(HttpStatus.SERVICE_UNAVAILABLE.value(),
            e.getMessage());
    }

    @ExceptionHandler
    public void handleException(OptimisticLockingException e,
        HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.CONFLICT.value(), e.getMessage());
    }
}
