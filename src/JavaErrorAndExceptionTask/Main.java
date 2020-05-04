package JavaErrorAndExceptionTask;

public class Main {

    public static void main(String[] args) {
        University university = new University();
        Student student = new Student("Petro", 7);
        student.setMarks(4);
        student.setMarks(7);
        Student student1 = new Student("Dmitro", 9);
        Faculty faculty = new Faculty("biology", "Math", "physic") ;
        Subjects subjects = new Subjects("Math", "biology", "physic", "cs", "logic");
        university.addUniversity(student);
        university.addFaculty(faculty);
        university.addSubjects(subjects);
        System.out.println(university.getMath() + " Math");
        System.out.println(student.getMarks());

//        university.addUniversity(student);
//        university.addUniversity(student1);
        System.out.println(student.getStudentName() + " "+ student.getEvaluation()+ " " + faculty.getMathFaculty());

    }
}
