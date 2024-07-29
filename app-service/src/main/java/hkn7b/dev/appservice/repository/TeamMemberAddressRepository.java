package hkn7b.dev.appservice.repository;

import hkn7b.dev.appservice.model.TeamMemberAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamMemberAddressRepository extends JpaRepository<TeamMemberAddress, Long> {

}
