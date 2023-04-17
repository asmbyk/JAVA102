public class Student {
    private String name;
    private String surname;
    private String idno;
    private String adress;
    private int note;

    public Student(String name, String surname, String idno, String adress, int note) {
        this.adress = adress;
        this.idno = idno;
        this.name = name;
        this.surname = surname;

        if (note < 100 || note > 0) {
            note = 0;
        }
        this.note = note;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(String surname) {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno(String idno) {
        return this.idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAdress(String adress) {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNote() {
        return this.note = note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
