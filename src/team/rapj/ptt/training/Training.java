package team.rapj.ptt.training;

import team.rpaj.ppt.people.Person;

import java.util.Arrays;

// comments
public class Training {
    private String trainingNo;
    private TrainingDetail td;
    private int len;
    private Person[] participants;

    public Training(String _trainingNo, TrainingDetail _td, Person[] _participants) {
        this.trainingNo = _trainingNo;
        this.td = _td;
        this.participants = _participants;
        this.len = _participants.length;
    }

    public void setTrainingNo(String trainingNo) {
        this.trainingNo = trainingNo;
    }

    public void setTrainingDetail(TrainingDetail td) {
        this.td = td;
    }

    public String getTrainingNo() {
        return trainingNo;
    }

    public TrainingDetail getTrainingDetail() {
        return td;
    }

    public void trainingModify() {



        // save date
    }

    @Override
    public String toString() {
        return "Training{" +
                "trainingNo='" + trainingNo + '\'' +
                ", len=" + len +
                ", participants=" + Arrays.toString(participants) +
                '}';
    }

    public static void main(String[] args) {

    }

}