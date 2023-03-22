package handlers;

import stateMachine.ElevatorMachine;

public class Button2Handler implements Handler {
	Handler nextHandler;
	ElevatorMachine elevator;

	public Button2Handler(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void handleRequest(String request) {
		if(request.equals("2"))
			elevator.pressButton2();
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
