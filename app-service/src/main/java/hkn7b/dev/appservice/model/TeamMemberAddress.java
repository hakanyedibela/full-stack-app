package hkn7b.dev.appservice.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "team_member_address")
public class TeamMemberAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "house_number", nullable = false)
    private int houseNumber;

    @Column(name = "extension")
    private String extension;

    @Column(name = "postal_code", nullable = false)
    private int postalCode;

    @Column(name = "place", nullable = false)
    private String place;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "mobile_number", nullable = false)
    private String mobileNumber;

}
