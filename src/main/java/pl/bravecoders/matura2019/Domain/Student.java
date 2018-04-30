package pl.bravecoders.matura2019.Domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@DiscriminatorValue("STUDENT")
class Student extends UserImpl {
    boolean isPremiumUser;
    Date birthday;
}
