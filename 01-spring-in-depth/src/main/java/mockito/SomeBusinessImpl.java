package mockito;

public class SomeBusinessImpl {
	
	DataService dataService;	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findGratestofAlldata() {
		int[] data =  dataService.getAllNumbers();
		
		int gratest = Integer.MIN_VALUE;
		for (int value : data) {
			if( value > gratest) {
				gratest=value;
			}			
		}			
		return gratest;
	}

}
