package edu.disease.asn2;

import java.util.UUID;

/**
 * Represents a non-infectious disease with properties such as disease ID and name.
 * This class is a subclass of the Disease class.
 */
class NonInfectiousDisease extends Disease{
	/**
     * Constructs a NonInfectiousDisease object with the provided parameters.
     *
     * @param diseaseId The unique identifier of the non-infectious disease.
     * @param name      The name of the non-infectious disease.
     */
	public NonInfectiousDisease(UUID diseaseId, String name) {
		super(diseaseId, name);
		
	}
	/**
     * Override the getExamples() method to provide examples of non-infectious diseases.
     *
     * @return An array of four non-infectious disease names.
     */
	@Override
	public String[] getExamples() {
		
		return new String[] {
				"Diabetes",
	            "Hypertension",
	            "Cancer",
	            "Alzheimer's disease"
	};
}
}
