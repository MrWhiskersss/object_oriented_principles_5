package stateMachine;

public class DoorsOpenState implements DoorState {
	ElevatorMachine elevator;

	public DoorsOpenState(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void closeDoors() {
		System.out.println("Doors are closed");
		elevator.setDoorState(elevator.getDoorsClosedState());
	}

	public void openDoors() {
	}
}
