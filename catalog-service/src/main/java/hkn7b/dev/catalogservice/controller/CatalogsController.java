package hkn7b.dev.catalogservice.controller;

import hkn7b.dev.catalogservice.entity.HTTPResponseMessage;
import hkn7b.dev.catalogservice.enums.ErrorReason;
import hkn7b.dev.catalogservice.exception.CatalogNotFoundException;
import hkn7b.dev.catalogservice.model.Catalog;
import hkn7b.dev.catalogservice.repository.CatalogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CatalogsController {

    private final CatalogRepository catalogRepository;

    public CatalogsController(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @GetMapping(path = "/livenessProbe",
            name = "livenessProbe",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getLivenessProbe() {
        return new ResponseEntity<>("Liveness Probe successfully established.", HttpStatus.OK);
    }

    @GetMapping(path = "/catalogs",
            name = "getAllCatalogs",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Flux<Catalog> getAllCatalogs() {
        return catalogRepository
                .findAll()
                .switchIfEmpty(Mono.
                        error(new CatalogNotFoundException("Error finding all catalogs")));
    }

    @ExceptionHandler(CatalogNotFoundException.class)
    ResponseEntity<HTTPResponseMessage> catalogNotFound(CatalogNotFoundException exception) {
        return ResponseEntity.badRequest().body(new HTTPResponseMessage(ErrorReason.CATALOG_NOT_FOUND.name()));
    }

}
