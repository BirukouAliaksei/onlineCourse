package JavaErrorAndExceptionTask;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private int evaluation;
    ArrayList<Integer> marks = new ArrayList<>();

    public Student(String studentName, int evaluation){
        this.studentName = studentName;
        this.evaluation = evaluation;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setMarks(int mark){
        this.marks.add(mark);
    }

    public ArrayList<Integer> getMarks(){
        return marks;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", evaluation=" + evaluation +
                '}';
    }
}
