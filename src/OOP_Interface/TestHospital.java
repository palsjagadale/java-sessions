package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortiesHospital fh = new FortiesHospital();
		fh.CardioServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.gynecServices();
		fh.neuroServices();
		fh.oncologyServices();
		fh.physioServices();
		fh.radiologyServices();
		fh.MedicalRD();
		fh.MedicalpatientData();
		fh.covidTest();
		fh.covidFunds();

		UKMedical uk = new FortiesHospital();
		uk.oncologyServices();
		uk.emergencyServices();

		HospitalManagement hm = new HospitalManagement();
		hm.MedicalpatientData();
		hm.MedicalRD();
		hm.covidTest();

	}

}
