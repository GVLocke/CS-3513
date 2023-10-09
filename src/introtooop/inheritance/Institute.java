package introtooop.inheritance;

public class Institute {
    private String name;
    private int yearFounded;
    private int facultyCount;
    private int staffCount;
    private int studentCount;
    private int numberOfDepartments;

    public Institute(String name, int yearFounded, int facultyCount, int staffCount, int studentCount, int numberOfDepartments) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.facultyCount = facultyCount;
        this.staffCount = staffCount;
        this.studentCount = studentCount;
        this.numberOfDepartments = numberOfDepartments;
    }

    public String getInstituteName() {
        return name;
    }

    public int getInstituteYearFounded() {
        return yearFounded;
    }

    public int getInstituteFacultyCount() {
        return facultyCount;
    }

    public int getInstituteStaffCount() {
        return staffCount;
    }

    public int getInstituteStudentCount() {
        return studentCount;
    }

    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    public void setInstituteName(String name) {
        this.name = name;
    }

    public void setInstituteYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public void setInstituteFacultyCount(int facultyCount) {
        this.facultyCount = facultyCount;
    }

    public void setInstituteStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }
}
