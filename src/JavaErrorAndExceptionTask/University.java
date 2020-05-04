package JavaErrorAndExceptionTask;

import java.util.ArrayList;

public class University implements iUniversity {

    ArrayList<Student> universities = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();
    ArrayList<Subjects> subject = new ArrayList<>();

    void addUniversity(Student university){
        universities.add(university);
    }

    void addFaculty(Faculty faculty){
        faculties.add(faculty);
    }

    void addSubjects(Subjects subjects){
        subject.add(subjects);
    }


    @Override
    public String getStudentName() {
        return null;
    }

    @Override
    public int getEvaluation() {
        return 0;
    }

    @Override
    public String getMath() {
        return null;
    }

    @Override
    public String getBiology() {
        return null;
    }

    @Override
    public String getPhysic() {
        return null;
    }

    @Override
    public String getCs() {
        return null;
    }

    @Override
    public String getLogic() {
        return null;
    }

    @Override
    public String getBiologyFaculty() {
        return null;
    }

    @Override
    public String getMathFaculty() {
        return null;
    }

    @Override
    public String getPhysicFaculty() {
        return null;
    }
}
