package pojos;

import com.google.gson.annotations.SerializedName;

public class Spartan {
    private String gender;
    private String name;
    private int phone;
    private int id;

    @Override
    public String toString() {
        return "Spartan{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                ", id=" + id +
                '}';
    }

    public Spartan(String gender, String name, int phone) {
        this.gender = gender;
        this.name = name;
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
