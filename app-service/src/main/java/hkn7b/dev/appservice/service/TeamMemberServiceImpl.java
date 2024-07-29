package hkn7b.dev.appservice.service;

import hkn7b.dev.appservice.model.TeamMember;
import hkn7b.dev.appservice.repository.TeamMemberRepository;
import org.springframework.stereotype.Service;

@Service
public class TeamMemberServiceImpl implements TeamMemberService {

    private final TeamMemberRepository teamMemberReposiotry;

    public TeamMemberServiceImpl(TeamMemberRepository teamMemberReposiotry) {
        this.teamMemberReposiotry = teamMemberReposiotry;
    }

    @Override
    public TeamMember getAllTeamMembers() {
        return null;
    }
}
