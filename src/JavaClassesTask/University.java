package JavaClassesTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class University{

    private String universityName;
    private ArrayList<Student> university = new ArrayList<Student>();

    void addStudent(Student student){
        university.add(student);
    }

    University(String universityName){
        this.universityName = universityName;
    }

    public String getUniversityName(){
        return universityName;
    }

    void swhowIdByCourse(){
//        ArrayList<Student> universitiesList = new ArrayList<>(university);
        for (Student s: getIdByCourse()) {
            System.out.println(s);
        }
    }

    ArrayList<Student> getIdByCourse() {
        ArrayList<Student> universitiesList = new ArrayList<>(university);
        Collections.sort(universitiesList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return new Integer (o1.getCourse()).compareTo(o2.getCourse());
            }
        });
        return universitiesList;
    }

    ArrayList<Student> getStudentListByDateOfBirth(int dateOfBirth){
        ArrayList<Student> dateBithList = new ArrayList<>();
        for (Student e : university){
            if (e.getDateOfBirth() >= dateOfBirth){
                dateBithList.add(e);
            }
        }
        return dateBithList;
    }

    public void printStudentListByDateOfBirth(int dateOfBirth){
        ArrayList<Student> printSortListByDate = getStudentListByDateOfBirth(dateOfBirth);
        for (Student e :
                printSortListByDate) {
            System.out.println(e);
        }
    }

    ArrayList<Student> getGroupList(int group){
        ArrayList<Student> groupList = new ArrayList<>();
        for (Student e: university){
           if (e.getGroup() == group){
               groupList.add(e);
           }
        }
        return groupList;
    }

    void printGroupList(int group){
        ArrayList<Student> printGroupList = getGroupList(group);
        for (Student e :
                printGroupList) {
            System.out.println(e);
        }
    }

    ArrayList<Student> getFacultyList(String faculty){
        ArrayList<Student> faculryList = new ArrayList<>();
        for (Student e : university){
            if (e.getFaculty().equalsIgnoreCase(faculty)){
                faculryList.add(e);
            }
        }
        return faculryList;
    }

    public void printFacultyList(String faculty) {
        ArrayList<Student> printFacultyList = getFacultyList(faculty);
        for (Student e : printFacultyList) {
            System.out.println(e);
        }
    }

    ArrayList<Student> getFacultyCourse(String faculty, int course){
        ArrayList<Student> faculryList = new ArrayList<>();
        for (Student e : university){
            if (e.getFaculty().equalsIgnoreCase(faculty) & e.getCourse() == course){
                faculryList.add(e);
            }
        }
        return faculryList;
    }

    public void printFacultyCourse(String faculty, int course){
        ArrayList<Student> printFacultyList = getFacultyCourse(faculty,course);
        for (Student e : printFacultyList) {
            System.out.println(e);
        }
    }
}
