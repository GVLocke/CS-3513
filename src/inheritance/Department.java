package inheritance;

public class Department extends Institute {
    private String name;
    private int yearFounded;
    private int facultyCount;
    private int staffCount;
    private int freshmanCount;
    private int sophomoreCount;
    private int juniorCount;
    private int seniorCount;
    private int graduateCount;

    public Department(String name, int yearFounded, int facultyCount, int staffCount, int studentCount, int numberOfDepartments, String departmentName, int departmentYearFounded, int departmentFacultyCount, int departmentStaffCount, int freshmanCount, int sophomoreCount, int juniorCount, int seniorCount, int graduateCount) {
        super(name, yearFounded, facultyCount, staffCount, studentCount, numberOfDepartments);
        this.name = departmentName;
        this.yearFounded = departmentYearFounded;
        this.facultyCount = departmentFacultyCount;
        this.staffCount = departmentStaffCount;
        this.freshmanCount = freshmanCount;
        this.sophomoreCount = sophomoreCount;
        this.juniorCount = juniorCount;
        this.seniorCount = seniorCount;
        this.graduateCount = graduateCount;
    }

    public String getDepartmentName() {
        return name;
    }

    public int getDepartmentYearFounded() {
        return yearFounded;
    }

    public int getDepartmentFacultyCount() {
        return facultyCount;
    }

    public int getDepartmentStaffCount() {
        return staffCount;
    }

    public int getFreshmanCount() {
        return freshmanCount;
    }

    public int getSophomoreCount() {
        return sophomoreCount;
    }

    public int getJuniorCount() {
        return juniorCount;
    }

    public int getSeniorCount() {
        return seniorCount;
    }

    public int getGraduateCount() {
        return graduateCount;
    }

    public void setDepartmentName(String name) {
        this.name = name;
    }

    public void setDepartmentYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public void setDepartmentFacultyCount(int facultyCount) {
        this.facultyCount = facultyCount;
    }

    public void setDepartmentStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public void setFreshmanCount(int freshmanCount) {
        this.freshmanCount = freshmanCount;
    }

    public void setSophomoreCount(int sophomoreCount) {
        this.sophomoreCount = sophomoreCount;
    }

    public void setJuniorCount(int juniorCount) {
        this.juniorCount = juniorCount;
    }

    public void setSeniorCount(int seniorCount) {
        this.seniorCount = seniorCount;
    }

    public void setGraduateCount(int graduateCount) {
        this.graduateCount = graduateCount;
    }
}