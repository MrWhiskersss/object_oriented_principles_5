package handlers;

public class DefaultHandler implements Handler {
	public DefaultHandler() {
	}

	public void handleRequest(String request) {
		System.out.println("ERROR: handler not found for " + request);
	}

	public void setNextHandler(Handler nextHandler) {
	}
}
