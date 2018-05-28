package xyz.typing365;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class VisitCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime createDate;
    protected VisitCounter(LocalDateTime date) {
        this.createDate = date;
    }

}
