package JavaErrorAndExceptionTask;

public class Faculty {

    private String biologyFaculty;
    private String mathFaculty;
    private String physicFaculty;

    public Faculty(String biologyFaculty, String mathFaculty, String physicFaculty){
        this.biologyFaculty = biologyFaculty;
        this.mathFaculty = mathFaculty;
        this.physicFaculty = physicFaculty;
    }

    public String getBiologyFaculty() {
        return biologyFaculty;
    }

    public String getMathFaculty() {
        return mathFaculty;
    }

    public String getPhysicFaculty() {
        return physicFaculty;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "biologyFaculty='" + biologyFaculty + '\'' +
                ", mathFaculty='" + mathFaculty + '\'' +
                ", physicFaculty='" + physicFaculty + '\'' +
                '}';
    }
}
