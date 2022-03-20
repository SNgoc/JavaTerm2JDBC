/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoctorMapIO;

/**
 *
 * @author asus
 */
public class Doctor {
    private String doctorId;
    private String name;
    private String speciality;
    private float hourExam;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public float getHourExam() {
        return hourExam;
    }

    public void setHourExam(float hourExam) {
        this.hourExam = hourExam;
    }

    public Doctor() {
    }

    public Doctor(String doctorId, String name, String speciality, float hourExam) {
        this.doctorId = doctorId;
        this.name = name;
        this.speciality = speciality;
        this.hourExam = hourExam;
    }

    @Override
    public String toString() {
        return getDoctorId() + " - " + getName() + " - " + getSpeciality() + " - " + getHourExam();
    }
}
