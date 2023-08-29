package edu.disease.asn2;

import java.util.UUID;

public class InfectiousDisease extends Disease{
	/**
	 * Constructs an InfectiousDisease object with the provided parameters.
	 *
	 * @param diseaseId The unique identifier of the infectious disease.
	 * @param name      The name of the infectious disease.
	 */

		public InfectiousDisease(UUID diseaseId, String name) {
			super(diseaseId, name);
			
		}
		 /**
	     * Override the getExamples() method to provide examples of infectious diseases.
	     *
	     * @return An array of four infectious disease names.
	     */
		@Override
		public String[] getExamples() {
			// TODO Auto-generated method stub
			return new String[] {
					"Influenza",
					"COVID-19",
					"Measles",
					"Malaria"
			};
		}
		
	}

