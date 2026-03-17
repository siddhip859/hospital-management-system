package com.hospital.model;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name="medical_history")

public class MedicalHistory {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="history_id")
private Long historyId;

@Column(name="patient_id")
private Long patientId;

private String diagnosis;
private String medicines;

@Column(name="visit_date")
private Date visitDate;

public MedicalHistory(){}

public Long getHistoryId() {
return historyId;
}

public void setHistoryId(Long historyId) {
this.historyId = historyId;
}

public Long getPatientId() {
return patientId;
}

public void setPatientId(Long patientId) {
this.patientId = patientId;
}

public String getDiagnosis() {
return diagnosis;
}

public void setDiagnosis(String diagnosis) {
this.diagnosis = diagnosis;
}

public String getMedicines() {
return medicines;
}

public void setMedicines(String medicines) {
this.medicines = medicines;
}

public Date getVisitDate() {
return visitDate;
}

public void setVisitDate(Date visitDate) {
this.visitDate = visitDate;
}

}