package com.hospital.model;

import jakarta.persistence.*;

@Entity
@Table(name="diseases")

public class Disease {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="disease_id")
private Long diseaseId;

@Column(name="disease_name")
private String diseaseName;

@Column(name="specialization_required")
private String specializationRequired;

public Disease(){}

public Long getDiseaseId() {
return diseaseId;
}

public void setDiseaseId(Long diseaseId) {
this.diseaseId = diseaseId;
}

public String getDiseaseName() {
return diseaseName;
}

public void setDiseaseName(String diseaseName) {
this.diseaseName = diseaseName;
}

public String getSpecializationRequired() {
return specializationRequired;
}

public void setSpecializationRequired(String specializationRequired) {
this.specializationRequired = specializationRequired;
}

}