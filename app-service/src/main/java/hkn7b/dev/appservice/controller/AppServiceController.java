package hkn7b.dev.appservice.controller;

import hkn7b.dev.appservice.entity.Developer;
import hkn7b.dev.appservice.service.ApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AppServiceController {

    private final ApplicationService applicationService;

    public AppServiceController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/developers")
    public ResponseEntity<?> getAllDevelopers() {
        applicationService.getAllDevelopers();
        return ResponseEntity.ok().body("Toll");
    }
}
