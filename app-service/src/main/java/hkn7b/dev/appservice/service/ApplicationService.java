package hkn7b.dev.appservice.service;

import hkn7b.dev.appservice.dao.ApplicationDao;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {

    private final ApplicationDao applicationFacade;

    public ApplicationService(ApplicationDao applicationFacade) {
        this.applicationFacade = applicationFacade;
    }

    public  void getAllDevelopers() {
        applicationFacade.getAllDevelopers();
    }
}
