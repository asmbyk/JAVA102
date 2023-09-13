public class Student {
    private String name;
    private String surname;
    private String idno;
    private String adress;

    private int note;


    public Student(String name, String surname, String idno, String adress, int note) {
        this.surname = surname;
        this.adress = adress;
        this.idno = idno;
        this.name = name;
        if (note > 100 || note < 0) { // iki kosuluda saglamak zorunda !!
            note = 0;

        }
        this.note = note;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdno() {
        return this.idno = idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getAdress() {
        return this.adress = adress;

    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNote() {
        return this.note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
