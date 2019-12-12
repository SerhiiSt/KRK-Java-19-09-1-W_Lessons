package pl.itacademy.lesson9;

public enum Sex  {

    FEMALE("Female"),
    MALE("Male");

    private String gender;

    Sex(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
