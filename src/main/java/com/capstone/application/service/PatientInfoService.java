package com.capstone.application.service;

import java.util.List;
import java.util.Optional;

import com.capstone.application.exception.PatientInfoException;
import com.capstone.application.model.Patient;

public interface PatientInfoService 
{

	public List<Patient> findAll()throws PatientInfoException ;
	public Optional<Patient> findById(Integer patientId) throws PatientInfoException;
    public Patient update(Patient patient);
    //Sangeeta
    public long countPatient();
    
}