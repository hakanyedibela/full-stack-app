package hkn7b.dev.appservice.service;

import hkn7b.dev.appservice.model.TeamMember;
import hkn7b.dev.appservice.repository.TeamMemberReposiotry;
import org.springframework.stereotype.Service;

@Service
public class TeamMemberServiceImpl implements TeamMemberService {

    private final TeamMemberReposiotry teamMemberReposiotry;

    public TeamMemberServiceImpl(TeamMemberReposiotry teamMemberReposiotry) {
        this.teamMemberReposiotry = teamMemberReposiotry;
    }

    @Override
    public TeamMember getAllTeamMembers() {
        return null;
    }
}
