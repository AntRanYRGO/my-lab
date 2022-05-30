package se.yrgo.schedule;

public class School {
    private String school_name;
    private String address;

    public School(String school_name, String address) {
        this.school_name = school_name;
        this.address = address;
    }

    public String getSchool_name() {
        return school_name;
    }

    public String getAddress() {
        return address;
    }
}
