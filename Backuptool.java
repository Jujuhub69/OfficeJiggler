import java.awt.*;

public class BackUpToolMain {
	public static final int SLEEP_MILLIS = 60 * 1000;
	public static int runtime = 0;
	
	public static void main(String... args) throws Exception {
		System.out.println("POV you: This is the best Backup-Tool i´ve ever used!");
		
		Robot robot = new Robot();
		int i =1;
		while (true) {
			
			Point point = MouseInfo.getPointerInfo().getLocation();

			robot.mouseMove(point.x + 1, point.y + 1);
			Thread.sleep(10);

			robot.mouseMove(point.x - 1, point.y - 1);
			Thread.sleep(10);

			robot.mouseMove(point.x + 1, point.y + 1);
			Thread.sleep(10);

			robot.mouseMove(point.x - 1, point.y - 1);
			Thread.sleep(10);
			
			System.out.println("--------------\nJaggerBackupTool. " + i++);


			
			
			System.out.println("Backup...");
			System.out.println("Relax CPU, sit back. Next folder in " + SLEEP_MILLIS / 1000 + " seconds...\n--------------");
			runtime = (runtime) + (SLEEP_MILLIS /(60 *1000));
			System.out.println("backup tool running since " + (runtime-1) + " Min...");
//			System.out.println("Please dont stop using me :(");
			Thread.sleep(SLEEP_MILLIS);

		}

	}
} 
