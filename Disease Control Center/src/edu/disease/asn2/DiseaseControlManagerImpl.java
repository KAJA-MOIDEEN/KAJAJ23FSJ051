package edu.disease.asn2;

import java.util.UUID;

import edu.disease.asn1.Exposure;

public class DiseaseControlManagerImpl implements DiseaseControlManager{
	
	private Disease[] diseases;
	private Patient[] patients; 
	public DiseaseControlManagerImpl (int maxDiseases, int maxPatients) {
		if(maxDiseases <=0 || maxPatients <=0) {
			throw new IllegalArgumentException("Max disease and max patient must be greater then zero.");
		}
		diseases = new Disease[maxDiseases];
		patients = new Patient[maxPatients];		
	}
	
	@Override
	public Disease addDisease(String name, boolean infectious) {
		UUID diseaseId = UUID.randomUUID();
		Disease disease;
		if(infectious) {
			disease = new InfectiousDisease(diseaseId , name);
		}else {
			disease = new NonInfectiousDisease(diseaseId, name);
		}
		for( int i = 0; i< diseases.length;i++) {
			if(diseases[i]==null) {
				diseases[i]=disease;
				return disease;
			}
		}
		throw new IllegalStateException("Cannot add disease. The diseases Are is full.");
	}

	@Override
	public Disease getDisease(UUID diseaseId) {
		for(Disease disease : diseases) {
			if(disease != null && disease.getDiseaseId().equals(diseaseId)) {
				return disease;
			}
		}
		return null;
	}

	@Override
	public Patient addPatient(String firstName, String lastName, int maxDisease, int maxExposures) {
		UUID patientId = UUID.randomUUID();
		Patient patient = new Patient(patientId, firstName, lastName, maxExposures, maxDisease);
		for(int i = 0; i< patients.length;i++) {
			if(patients[i]==null) {
				patients[i]=patient;
				return patient;
			} 
		}
		throw new IllegalArgumentException("Cannot add patirnt. the patients array is full");
	}

	@Override
	public Patient getPatient(UUID patientId) {
		for(Patient patient : patients) {
			if(patient != null && patient.getPatientId().equals(patientId)) {
				return patient;
			}
		}
		throw new IllegalStateException("Cannot add patient. The patient array is full");
	}

	@Override
	public void addDiseaseToPatient(UUID patientId, UUID diseaseId) {
		Patient patient = getPatient(patientId);
		Disease disease = getDisease(diseaseId);
		if(patient == null && disease == null) {
			throw new IllegalArgumentException("Given patient and disease with given ID not found.");
		}else{
			patient.addDiseaseId(diseaseId);
		}
	}

	@Override
	public void addExposureToPatient(UUID patientId, Exposure exposure) {
		Patient patient =  getPatient(patientId);
		if(patient==null) {
			throw new IllegalArgumentException("Patient With Given ID is Not Found");
		}
		patient.addExposureId(exposure);
	}

}
