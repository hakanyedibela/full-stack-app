package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.model.TeamMemberEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface TeamMemberEntryRepository extends JpaRepository<TeamMemberEntry, Long> {

}
