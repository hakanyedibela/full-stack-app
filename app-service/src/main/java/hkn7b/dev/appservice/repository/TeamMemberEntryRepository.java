package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.model.TeamMemberEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberEntryRepository extends JpaRepository<TeamMemberEntry, Long> {
}
