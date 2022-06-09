package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// USA
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");
	}

	// UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	// India
	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	// Individual
	public void medicalInsurance() {
		System.out.println("FH -- medical Insurance");
	}

	public void medicalTrainng() {
		System.out.println("FH -- medicalTrainng");
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination");

	}

	@Override
	public void covidGuidelines() {
		System.out.println("FH -- covidGuidelines");

	}

	@Override
	public void medicalFunds() {
		System.out.println("FH -- medicalFunds");

	}
	
	
	public static void billing() {
		System.out.println("FH -- billing....");
	}

//	@Override
//	public void medNews() {
//		System.out.println("US -- med news");
//	}
	
	
	
	
}
