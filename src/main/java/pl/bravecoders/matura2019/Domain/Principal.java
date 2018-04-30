package pl.bravecoders.matura2019.Domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Set;

@Entity
@DiscriminatorValue("PRINCIPAL")
class Principal extends UserImpl {
    String schoolName;
    @ManyToMany
    Set<Classroom> listOfClassrooms;
}
