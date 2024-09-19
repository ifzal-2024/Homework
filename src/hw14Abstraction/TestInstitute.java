package hw14Abstraction;

public class TestInstitute {
	public static void main(String[] args) {

		System.out.println("\n---------------Regular Class ColumbiaUniversity-----------");
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.biology();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.emergencyRoom();
		cu.surgeryRoom();
		cu.cafeteria();
		cu.vocationalInfo();
		cu.classSize();
		cu.playGround();
		cu.teacher();
		cu.lawInfo();
		cu.anatomyLab();
		cu.hygiene();
		cu.bioChemistryLab();
		cu.caring();
		cu.aeronauticalInfo();
		cu.mechanicalLab();
		cu.maths();
		cu.computerLab();
		cu.anthropology();
		cu.gymnasium();
		cu.dorm();
		cu.morgue();

		System.out.println("\n-----------------Interface University----------------------------------");
		University uni = new ColumbiaUniversity();
		uni.classSize();
		uni.playGround();
		uni.teacher();
		University.library();
		uni.gymnasium();
		uni.commonRoom();
		uni.laboratory();
		uni.languageClub();
		uni.dorm();
		College.studyRoom();
		// Univeristy.studyRoom(); // Static method of classes can be inherited by
		// Subclass, but static method
		// of Interface cannot be inherited by implmeneting class or another iNterface
		// However we can call static method of interface directly using their Interface
		// Name.
		uni.emergencyRoom();
		uni.surgeryRoom();
		uni.cafeteria();
		uni.morgue();
		Hospital.pharmacy();

		System.out.println("\n----------------------- Abstract Class Medical School----------------");
		MedicalSchool ms = new ColumbiaUniversity();
		ms.bioChemistryLab();
		ms.anatomyLab();
		ms.caring();
		ms.hygiene();
		ms.maths();
		ms.aeronauticalInfo();
		ms.mechanicalLab();
		ms.computerLab();
		ms.mechanicalLab();
		ms.anthropology();
		ms.lawInfo();

	}

}
