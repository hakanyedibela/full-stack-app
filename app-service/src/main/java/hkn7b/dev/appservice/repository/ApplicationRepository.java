package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Developer, Long> {
}
