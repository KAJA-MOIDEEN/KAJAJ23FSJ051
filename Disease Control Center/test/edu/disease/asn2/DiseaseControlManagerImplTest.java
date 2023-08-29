package edu.disease.asn2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;

import edu.disease.asn1.Exposure;

class DiseaseControlManagerImplTest { 
	 
	
	
	@Test
    void testAddDiseaseAndGetDisease() {
        
		DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(10, 10);
        Disease disease = manager.addDisease("COVID-19", true); 
        assertNotNull(disease);
        
        UUID diseaseId = disease.getDiseaseId();

        Disease retrievedDisease = manager.getDisease(diseaseId);
        assertEquals(disease , retrievedDisease);
        
    }
	 @Test
	    public void testAddPatientAndGetPatient() {
	        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(10, 10);

	        Patient patient = manager.addPatient("John", "Doe", 5, 3);
	        assertNotNull(patient);
	        
	        UUID patientId = patient.getPatientId();
	        Patient retrievedPatient = manager.getPatient(patientId);
	        assertEquals(patient, retrievedPatient);
	    }
	@Test
    void testAddDiseaseToPatient() {
        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(10, 10);
        Patient patient = manager.addPatient("Alice", "Smith", 5, 3);
        Disease disease = manager.addDisease("Flu", true);
        
        UUID patientId = patient.getPatientId();
        UUID diseaseId = disease.getDiseaseId();
        
        manager.addDiseaseToPatient(patientId, diseaseId);
        Patient retrievedPatient = manager.getPatient(patientId);
        assertTrue(retrievedPatient.getdiseaselds()[0].equals(diseaseId));
    }
	 @Test
	  void testAddExposureToPatient() {
	        DiseaseControlManagerImpl manager = new DiseaseControlManagerImpl(10, 10);

	        Patient patient = manager.addPatient("Bob", "Johnson", 5, 3);
	        Exposure exposure = new Exposure(/* ... */); // Create an Exposure instance here

	        manager.addExposureToPatient(patient.getPatientId(), exposure);

	        Patient retrievedPatient = manager.getPatient(patient.getPatientId());
	        assertTrue(retrievedPatient.getExposures()[0].equals(exposure));
	        
	
	    }
	}


