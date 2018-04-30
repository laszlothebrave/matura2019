package pl.bravecoders.matura2019.Domain;

import javax.persistence.*;

@Entity(name="userImpl")
@Inheritance
@DiscriminatorColumn(name="student_teacher_principal",
        discriminatorType = DiscriminatorType.STRING)
class UserImpl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String mame;
    String surname;
    String login;
    String password;
    String email;
    UserType userType;
}
