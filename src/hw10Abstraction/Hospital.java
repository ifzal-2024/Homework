package hw10Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void SurgeryRoom();

	public void cafeteria();

	public default void morgue() {

	}

	public static void pharmacy() {

	}

}
