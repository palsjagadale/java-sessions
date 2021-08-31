package OOP_Interface;

public class FortiesHospital extends HospitalManagement implements UKMedical, IndianMedical, USMedical {

	@Override
	public void ENTServices() {
		System.out.println("FH------ENTServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH------oncologyServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FH------emergencyServices");
	}

	@Override
	public void radiologyServices() {
		System.out.println("FH------radiologyServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH------neuroServices");

	}

	@Override
	public void physioServices() {
		System.out.println("FH------physioServices");

	}

	@Override
	public void CardioServices() {
		System.out.println("FH------CardioServices");

	}

	@Override
	public void gynecServices() {
		System.out.println("FH------gynecServices");

	}

	@Override
	public void MedicalRD() {
		System.out.println("FH------MedicalRD");

	}

	@Override
	public void MedicalpatientData() {
		System.out.println("FH.........MedicalpatientData");
	}

	
	public void covidTest() {
		System.out.println("\"FH.........covidTest");
	}

}
