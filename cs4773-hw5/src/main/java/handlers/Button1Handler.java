package handlers;

import stateMachine.ElevatorMachine;

public class Button1Handler implements Handler {
	Handler nextHandler;
	ElevatorMachine elevator;

	public Button1Handler(ElevatorMachine elevator) {
		this.elevator = elevator;
	}

	public void handleRequest(String request) {
		if(request.equals("1"))
			elevator.pressButton1();
		else
			nextHandler.handleRequest(request);
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}
