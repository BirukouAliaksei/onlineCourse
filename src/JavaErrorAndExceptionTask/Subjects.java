package JavaErrorAndExceptionTask;

public class Subjects {
    private String math;
    private String biology;
    private String physic;
    private String cs;
    private String logic;

    Subjects(String math, String biology, String physic, String cs, String logic){
        this.math = math;
        this.biology = biology;
        this.physic = physic;
        this.cs = cs;
        this.logic = logic;
    }

    public String getMath() {
        return math;
    }

    public String getBiology() {
        return biology;
    }

    public String getPhysic() {
        return physic;
    }

    public String getCs() {
        return cs;
    }

    public String getLogic() {
        return logic;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "math='" + math + '\'' +
                ", biology='" + biology + '\'' +
                ", physic='" + physic + '\'' +
                ", cs='" + cs + '\'' +
                ", logic='" + logic + '\'' +
                '}';
    }
}
