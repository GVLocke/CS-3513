package inheritance;

/**
 * A student at a university.
 */
public class Student extends Department {
    private String name;
    private int age;
    private int registrationNumber;
    private int height;
    private int weight;

    /**
     * Constructs a student with a name, age, registration number, height, and weight.
     * @param name the name of the student
     * @param age the age of the student
     * @param registrationNumber the registration number of the student
     * @param height the height of the student in inches
     * @param weight the weight of the student in lbs
     */
    public Student(String instituteName, int instituteYearFounded, int instituteFacultyCount, int instituteStaffCount, int instituteStudentCount, int instituteNumberOfDepartments, String departmentName, int departmentYearFounded, int departmentFacultyCount, int departmentStaffCount, int departmentFreshmanCount, int departmentSophomoreCount, int departmentJuniorCount, int departmentSeniorCount, int departmentGraduateCount, String name, int age, int registrationNumber, int height, int weight) {
        super(instituteName, instituteYearFounded, instituteFacultyCount, instituteStaffCount, instituteStudentCount, instituteNumberOfDepartments, departmentName, departmentYearFounded, departmentFacultyCount, departmentStaffCount, departmentFreshmanCount, departmentSophomoreCount, departmentJuniorCount, departmentSeniorCount, departmentGraduateCount);
        this.name = name;
        this.age = age;
        this.registrationNumber = registrationNumber;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Gets the name of the student.
     * @return the name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the student.
     * @return the age of the student
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the registration number of the student.
     * @return the registration number of the student
     */
    public int getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Gets the height of the student.
     * @return the height of the student
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the weight of the student.
     * @return the weight of the student
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the name of the student.
     * @param name the name of the student
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the student.
     * @param age the age of the student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the registration number of the student.
     * @param registrationNumber the registration number of the student
     */
    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * Sets the height of the student.
     * @param height the height of the student
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Sets the weight of the student.
     * @param weight the weight of the student
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
