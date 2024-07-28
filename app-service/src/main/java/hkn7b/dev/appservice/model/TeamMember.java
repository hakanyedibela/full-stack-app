package hkn7b.dev.appservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "team_member")
public class TeamMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "job_description", nullable = false)
    private String jobPosition;

    @Column(name = "age", length = 100, nullable = false)
    private int age;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "teamMember",
    cascade = CascadeType.PERSIST, targetEntity = TeamMemberEntry.class)
    private Set<TeamMemberEntry> teamMemberEntries;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL,
    targetEntity = TeamMemberAddress.class)
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    private TeamMemberAddress teamMemberAddress;
}
