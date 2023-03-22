package stateMachine;

public class DoorsClosedState implements DoorState {
	ElevatorMachine elevator;

	public DoorsClosedState(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void closeDoors() {
	}

	public void openDoors() {
		System.out.println("Doors are open");
		elevator.setDoorState(elevator.getDoorsOpenState());
	}
}
