package hkn7b.dev.appservice.service;

import hkn7b.dev.appservice.facade.ApplicationFacade;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private final ApplicationFacade applicationFacade;

    public ApplicationService(ApplicationFacade applicationFacade) {
        this.applicationFacade = applicationFacade;
    }

    public  void getAllDevelopers() {
        applicationFacade.getAllDevelopers();
    }
}
