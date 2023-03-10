package eu.asgardschmiede.restbase.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

//@Getter @Setter
@Data //Enthält u.a. Getter und Setter
@NoArgsConstructor //Parameterloser Konstruktor
@AllArgsConstructor //Konstruktor mit allen Parametern
@ToString
@EqualsAndHashCode
@Builder
@Entity
//@RequiredArgsConstructor // Nimmt Parameter für finale Eigenschaften entgegen
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Column(length = 50)
    private String type;

    @Column(length = 12)
    private String registration;

    @Enumerated(EnumType.STRING)
    private Status status;


}
