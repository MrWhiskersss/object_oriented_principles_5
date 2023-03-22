package handlers;

import stateMachine.ElevatorMachine;

public class Button3Handler implements Handler {
	Handler nextHandler;
	ElevatorMachine elevator;

	public Button3Handler(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void handleRequest(String request) {
		if(request.equals("3"))
			elevator.pressButton3();
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
