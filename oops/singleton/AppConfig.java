package oops.singleton;

public class AppConfig {
	static int count = 0;
	private AppConfig() {
		count++;
		System.out.println("Default constructor " + this.count);
	}
	
	private static AppConfig obj= null;
	
	public static AppConfig getInstance() {
		if (obj==null) {
			obj= new AppConfig();
		}
		return obj;
	}

}
