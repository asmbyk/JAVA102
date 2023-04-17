public class Instructor {
    private String name;
    private String surname;
    private String departmant;

    public Instructor(String name, String surname, String departmant) {
        this.departmant = departmant;
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String surname) {
        return this.surname = surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartmant(String departmant) {
        return this.departmant = departmant;
    }

    public void setDepartmant(String departmant) {
        this.departmant = departmant;
    }
}
