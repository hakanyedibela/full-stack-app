package hkn7b.dev.appservice.facade;

import hkn7b.dev.appservice.dao.ApplicationDao;
import org.springframework.stereotype.Service;

@Service
public class ApplicationFacade {

    private final ApplicationDao applicationDao;

    public ApplicationFacade(ApplicationDao applicationDao) {
        this.applicationDao = applicationDao;
    }

    public void getAllDevelopers() {
        applicationDao.getAllDevelopers();
    }
}
