package stateMachine;

public class ElevatorMachine {
	FloorState floor1;
	FloorState floor2;
	FloorState floor3;

	DoorState doorsOpen;
	DoorState doorsClosed;

	FloorState floor;
	DoorState doors;

	public ElevatorMachine() {
		floor1 = new Floor1State(this);
		floor2 = new Floor2State(this);
		floor3 = new Floor3State(this);

		doorsOpen = new DoorsOpenState(this);
		doorsClosed = new DoorsClosedState(this);

		floor = floor1;
		doors = doorsOpen;
	}

	public void pressButton1() {
		System.out.println("1 pressed");
		floor.pressButton1();
	}

	public void pressButton2() {
		System.out.println("2 pressed");
		floor.pressButton2();
	}

	public void pressButton3() {
		System.out.println("3 pressed");
		floor.pressButton3();
	}

	public void closeDoors() {
		doors.closeDoors();
	}

	public void openDoors() {
		doors.openDoors();
	}

	protected void setFloorState(FloorState floor) {
		this.floor = floor;
	}

	protected void setDoorState(DoorState doors) {
		this.doors = doors;
	}

	protected FloorState getFloor1State() {
		return floor1;
	}

	protected FloorState getFloor2State() {
		return floor2;
	}

	protected FloorState getFloor3State() {
		return floor3;
	}

	protected DoorState getDoorsOpenState() {
		return doorsOpen;
	}

	protected DoorState getDoorsClosedState() {
		return doorsClosed;
	}
}
