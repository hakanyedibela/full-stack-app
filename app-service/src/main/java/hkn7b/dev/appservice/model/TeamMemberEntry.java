package hkn7b.dev.appservice.model;

import jakarta.persistence.*;
import jakarta.persistence.criteria.Fetch;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "team_members_entry")
public class TeamMemberEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", referencedColumnName = "id",
    nullable = false)
    private TeamMember teamMember;

    @Column(name = "eductions")
    private List<String> eductions;

    @Column(name = "experiences")
    private List<String> experiences;

}
