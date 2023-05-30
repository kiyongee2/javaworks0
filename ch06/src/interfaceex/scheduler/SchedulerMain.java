package interfaceex.scheduler;

public class SchedulerMain {

	public static void main(String[] args) {
		Scheduler roundRobin = new RoundRobin();
		
		roundRobin.getNextCall();
		roundRobin.sendCallToAgent();
	}

}
