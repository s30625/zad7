public class StudyProgramme {

    private String name;
    private String desc;
    private int semesters;
    private int possibleITNs;

    public StudyProgramme(String name, String desc, int semesters, int possibleITNs) {
        this.name = name;
        this.desc = desc;
        this.semesters = semesters;
        this.possibleITNs = possibleITNs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getSemesters() {
        return semesters;
    }

    public void setSemesters(int semesters) {
        this.semesters = semesters;
    }

    public int getPossibleITNs() {
        return possibleITNs;
    }

    public void setPossibleITNs(int possibleITNs) {
        this.possibleITNs = possibleITNs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Study program: ");
        sb.append("\n");
        sb.append("\n");
        sb.append("Name: ");
        sb.append(this.name);
        sb.append("\n");
        sb.append("Desc: ");
        sb.append(this.desc);
        sb.append("\n");
        sb.append("Semesters: ");
        sb.append(this.semesters);
        sb.append("\n");
        sb.append("Possible ITNs: ");
        sb.append(this.possibleITNs);
        sb.append("\n");
        return sb.toString();
    }
}
