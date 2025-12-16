@Entity
public class PasswordEntry {

    @Id @GeneratedValue
    private Long id;

    private String service;
    private String login;
    private String encryptedPassword;

    @ManyToOne
    private User owner;
}
