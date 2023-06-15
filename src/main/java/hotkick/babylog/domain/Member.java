package hotkick.babylog.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "member")
@Getter
@Setter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;


    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    /*
     * 향후 추가
     * private String email;
     * private String birthDay;
     * private String creatDay;
     * private String type;
     * private String prof;
     * private String ment;
     */

}