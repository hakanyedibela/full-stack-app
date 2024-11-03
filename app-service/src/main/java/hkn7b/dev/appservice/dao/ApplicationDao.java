package hkn7b.dev.appservice.dao;

import hkn7b.dev.appservice.repository.ApplicationRepository;
import org.springframework.stereotype.Component;

@Component
public class ApplicationDao {

    private final ApplicationRepository applicationRepository;

    public ApplicationDao(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public void getAllDevelopers() {
        applicationRepository.findAll().forEach(application -> System.out.println("RESULT: " + application));
    }
}
