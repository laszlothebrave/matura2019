package pl.bravecoders.matura2019.Domain;

import pl.bravecoders.matura2019.Domain.Exercise;
import pl.bravecoders.matura2019.Domain.ExerciseImpl;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Classroom{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToMany(targetEntity = UserImpl.class)
    Set<User> listOfStudents;
}