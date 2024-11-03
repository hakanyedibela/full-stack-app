package hkn7b.dev.appservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "developer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Developer {

    @Id
    @SequenceGenerator(name = "developersSequence", sequenceName = "known_developers_id_seq",
            allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "developersSequence")
    private Long id;

    private String firstName;
    private String lastName;
    private Date birthDate;
    private String email;
    private Integer phone;
    private Integer mobilePhone;
    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String state;
    private String website;
}
