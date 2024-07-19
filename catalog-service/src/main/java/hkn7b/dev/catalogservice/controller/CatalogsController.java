package hkn7b.dev.catalogservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogsController {

    @GetMapping(path = "/livenessProbe",
            name = "Liveness Probe GET Endpoint",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getLivenessProbe() {
        return new ResponseEntity<>("Liveness Probe successfully established.", HttpStatus.OK);
    }

    @GetMapping(path = "/catalogs")
    public ResponseEntity<?> getAllCatalogs() {

        return new ResponseEntity<>("Hello", HttpStatus.OK);
    }
}
