package pl.bravecoders.matura2019.Domain;

import java.sql.Date;
import java.util.ArrayList;

class ExerciseImpl implements Exercise{
    int id;
    String orderText;
    int maxPoints;
    ArrayList<Integer> fieldsOfKnowledge;
    int timeRequired;
    int difficulty;
    User addedBy;
    Date addDate;
    User correctedBy;
    Date correctionDate;
    User checkedBy;
    Date checkDate;
}


