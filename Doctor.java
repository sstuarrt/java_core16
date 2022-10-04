package com.company.java_core.homework16.task1;

import java.io.Serializable;
import java.util.Objects;

public class Doctor implements Serializable {
    public String docName;
    public String specialization;
    private int age;
    private String patient;

    public Doctor() {}

    public Doctor(String docName, String specialization, int age, String patient) {
        this.docName = docName;
        this.specialization = specialization;
        this.age = age;
        this.patient = patient;
    }

    public Doctor(String docName, String specialization) {
        this.docName = docName;
        this.specialization = specialization;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && docName.equals(doctor.docName) && specialization.equals(doctor.specialization) && patient.equals(doctor.patient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docName, specialization, age, patient);
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "docName - " + docName +
                ", specialization - " + specialization +
                ", age - " + age +
                ", patient - " + patient;
    }
}
