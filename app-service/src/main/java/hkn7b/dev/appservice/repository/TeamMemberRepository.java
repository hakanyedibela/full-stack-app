package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMember, Long> {

    List<TeamMember> findAllTeamMemberByJobCode(String jobCode);

    TeamMember findTeamMemberById(Long id);
}
