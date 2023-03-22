package stateMachine;

public class Floor2State implements FloorState {
	ElevatorMachine elevator;

	public Floor2State(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void pressButton1() {
		elevator.closeDoors();
		System.out.println("Going down...");
		elevator.setFloorState(elevator.getFloor1State());
		System.out.println("*ding* The elevator arrives at Floor 1");
		elevator.openDoors();
	}

	public void pressButton2() {
		elevator.closeDoors();
		System.out.println("Nothing happens");

	}

	public void pressButton3() {
		elevator.closeDoors();
		System.out.println("Going up...");
		elevator.setFloorState(elevator.getFloor3State());
		System.out.println("*ding* The elevator arrives at Floor 3");
		elevator.openDoors();
	}
}
