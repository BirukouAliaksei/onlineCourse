package JavaClassesTask;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        University grodnoUniversity = new University("Grodno University");

        grodnoUniversity.addStudent(new Student(1, "Sumkin", "Fedor", "Fedorovich", 1990,
                "Grodno", 802966644, "Math", 5, 3));
        grodnoUniversity.addStudent(new Student(2, "Petrov", "Fedor", "Fedorovich", 1989,
                "Grodno", 802966644, "Geography", 3, 3));
        grodnoUniversity.addStudent(new Student(3, "Ivanov", "Fedor", "Fedorovich", 1991,
                "Grodno", 802966644, "Biology", 4, 5));
        grodnoUniversity.addStudent(new Student(4, "Sidorou", "Fedor", "Fedorovich", 1995,
                "Grodno", 802966644, "Math", 4, 3));

        System.out.println("List by date of birth");
        grodnoUniversity.printStudentListByDateOfBirth(1990);

        System.out.println("List by group");
        grodnoUniversity.printGroupList(3);

        System.out.println("List by faculty");
        grodnoUniversity.printFacultyList("math");

        System.out.println("List by faculty and course");
        grodnoUniversity.printFacultyCourse("math", 5);

    }
}
