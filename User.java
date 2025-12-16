@Entity
@Table(name = "users")
public class User {

    @Id @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    private String passwordHash;
    private String mfaSecret;

    // gettery/settery
}
