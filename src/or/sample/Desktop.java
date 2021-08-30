package or.sample;

public class Desktop implements software,Hardware {
		
	@Override
	public void hardwareResources() {
		System.out.println("58");
		
	}
	@Override
	public void SoftwareResouces() {
		System.out.println("85");
		
	}
	public void desktopmodel() {
		System.out.println("52");

	}	
		
	public static void main(String[] args) {
		Desktop de = new Desktop();
		de.hardwareResources();
		de.SoftwareResouces();
		de.desktopmodel();
			
	}
				
		
	}

