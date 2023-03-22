package stateMachine;

public class Floor3State implements FloorState {
	ElevatorMachine elevator;

	public Floor3State(ElevatorMachine elevator) {
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
		System.out.println("Going down...");
		elevator.setFloorState(elevator.getFloor2State());
		System.out.println("*ding* The elevator arrives at Floor 2");
		elevator.openDoors();
	}

	public void pressButton3() {
		elevator.closeDoors();
		System.out.println("Nothing happens");
	}
}
