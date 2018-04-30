package pl.bravecoders.matura2019.Domain;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;

@Entity
class ExerciseImpl implements Exercise{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderText;
    private int maxPoints;
    private ArrayList<Integer> fieldsOfKnowledge;
    private int timeRequired;
    private int difficulty;
    @ManyToOne(targetEntity=UserImpl.class)
    private User addedBy;
    private Date addDate;
    @ManyToOne(targetEntity=UserImpl.class)
    private User correctedBy;
    private Date correctionDate;
    @ManyToOne(targetEntity=UserImpl.class)
    private User checkedBy;
    private Date checkDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public ArrayList<Integer> getFieldsOfKnowledge() {
        return fieldsOfKnowledge;
    }

    public void setFieldsOfKnowledge(ArrayList<Integer> fieldsOfKnowledge) {
        this.fieldsOfKnowledge = fieldsOfKnowledge;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(int timeRequired) {
        this.timeRequired = timeRequired;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public User getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(User addedBy) {
        this.addedBy = addedBy;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public User getCorrectedBy() {
        return correctedBy;
    }

    public void setCorrectedBy(User correctedBy) {
        this.correctedBy = correctedBy;
    }

    public Date getCorrectionDate() {
        return correctionDate;
    }

    public void setCorrectionDate(Date correctionDate) {
        this.correctionDate = correctionDate;
    }

    public User getCheckedBy() {
        return checkedBy;
    }

    public void setCheckedBy(User checkedBy) {
        this.checkedBy = checkedBy;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }
}


