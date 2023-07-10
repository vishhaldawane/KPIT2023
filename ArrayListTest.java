import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		//CONTENT - x - WATER
		LogMessage log1 = new LogMessage("Reeta","Dialed", LocalDateTime.of(2023,7,6,10,30,00));
		LogMessage log2 = new LogMessage("Seeta","Recieved", LocalDateTime.of(2023,7,7,11,30,00));
		LogMessage log3 = new LogMessage("Neeta","Missed", LocalDateTime.of(2023,7,9,12,30,00));
		LogMessage log4 = new LogMessage("Meeta","Recieved", LocalDateTime.of(2023,7,9,13,30,00));
		LogMessage log5 = new LogMessage("Jeeta","Missed", LocalDateTime.of(2023,7,9,14,30,00));
			System.out.println("Content is ready....");
		
		//GLASS
		ArrayList logList = new ArrayList(); //CONTAINER
		System.out.println("Container is ready....");
		
		logList.add(log1); //WATER IS ADDED
		logList.add(log2);
		logList.add(log3);
		logList.add(log4);
		logList.add(log5);
		System.out.println("content is added....");

		//NOW GET THE STRAW TO ACCESS THE CONTENT
		
		Iterator logIterator = logList.iterator();
		System.out.println("Accessed the iterator...to step through the container....");
		
		while(logIterator.hasNext()) {
			LogMessage log = (LogMessage) logIterator.next();
			log.showLog();
		}
		
	}
}

class LogMessage
{
	String phoneBy;
	String typeOfLog;
	LocalDateTime dateAndTime;
	public LogMessage(String phoneBy, String typeOfLog, LocalDateTime dateAndTime) {
		super();
		this.phoneBy = phoneBy;
		this.typeOfLog = typeOfLog;
		this.dateAndTime = dateAndTime;
	}
	
	void showLog() {
		System.out.println("Phone By    : "+phoneBy);
		System.out.println("Type Of Log : "+typeOfLog);
		System.out.println("Date Time   : "+dateAndTime);
		System.out.println("--------------");
	}
	
	
}
