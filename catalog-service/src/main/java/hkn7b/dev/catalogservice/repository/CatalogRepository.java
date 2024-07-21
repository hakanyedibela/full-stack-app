package hkn7b.dev.catalogservice.repository;

import hkn7b.dev.catalogservice.model.Catalog;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface CatalogRepository extends ReactiveMongoRepository<Catalog, String> {

    @Query("{ catalogName:  '?0' } ")
    Mono<Catalog> findByCatalogName(String catalogName);
}
