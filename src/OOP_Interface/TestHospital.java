package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.pediaServices();
		fh.emergencyServices();
		fh.physioServices();
		fh.medicalInsurance();
		fh.medicalTrainng();
		fh.covid19Vaccination();
		fh.covidGuidelines();
		fh.patientHistory();
		
		System.out.println(USMedical.min_fee);
		USMedical.billing();
		System.out.println(FortisHospital.min_fee);
		FortisHospital.billing();
		//fh.billing();
		fh.medNews();
		
		
		//Top Casting:
		//child class object can be referred by parent interface ref variable:
		USMedical us = new FortisHospital();
		
		us.cardioServices();
		us.pediaServices();
		us.emergencyServices();
		us.physioServices();
		
		
		WHO wh = new FortisHospital();
		wh.covid19Vaccination();
		wh.covidGuidelines();
		
		
		//Down Casting:
		//FortisHospital fh1 = new USMedical();
		
		
		
	}

}
