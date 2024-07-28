package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberReposiotry extends JpaRepository<TeamMember, Long> {

}
