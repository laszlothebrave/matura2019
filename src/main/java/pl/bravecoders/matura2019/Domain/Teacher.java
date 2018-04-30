package pl.bravecoders.matura2019.Domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
@DiscriminatorValue("TEACHER")
class Teacher extends UserImpl {
    String schoolName;
    @ManyToMany
    Set<Classroom> listOfClassrooms;
}
