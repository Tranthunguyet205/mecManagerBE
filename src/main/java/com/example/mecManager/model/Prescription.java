package com.example.mecManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "prescription")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prescription_code",nullable = false)
    private String prescriptionCode;// ma don thuoc

    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private PatientProfile patientProfile;

    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private DocInfo docInfo;

    @Column(name = "note")
    private String note;

    @Column(name = "created_at", nullable = false)
    private Date createdAt; // ngay tao ban ghi

    @Column(name = "updated_at")
    private Date updatedAt;
}
