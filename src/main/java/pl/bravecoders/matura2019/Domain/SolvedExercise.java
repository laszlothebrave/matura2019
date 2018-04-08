package pl.bravecoders.matura2019.Domain;

import java.sql.Date;

class SolvedExercise {
    int id;
    Exercise exercise;
    Answer answer;
    User user;
    Date date;
    Exam exam;
}
