package elevator;

import java.io.FileReader;
import java.util.StringTokenizer;

import stateMachine.ElevatorMachine;
import tools.*;
import handlers.*;

public class App {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("please specify input file path...");
			return;
		}

		ElevatorMachine elevator = new ElevatorMachine();

		Button1Handler button1Handler = new Button1Handler(elevator);
		Button2Handler button2Handler = new Button2Handler(elevator);
		Button3Handler button3Handler = new Button3Handler(elevator);
		DefaultHandler defaultHandler = new DefaultHandler();

		button1Handler.setNextHandler(button2Handler);
		button2Handler.setNextHandler(button3Handler);
		button3Handler.setNextHandler(defaultHandler);

		FileReader fileReader = FileTools.getFileReader(args[0]);
		CleanerReader reader = new CleanerReader(fileReader);

		String buttonsToPress = "";

		if(reader.ready())
			buttonsToPress = reader.readLine();

		StringTokenizer buttons = new StringTokenizer(buttonsToPress, " ");

		while(buttons.hasMoreTokens())
			button1Handler.handleRequest(buttons.nextToken());
	}
}
