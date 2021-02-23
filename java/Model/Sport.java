package Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="aktivitaet")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String uebung;
    private int wiederholungen;
    private String kommentar;
}
