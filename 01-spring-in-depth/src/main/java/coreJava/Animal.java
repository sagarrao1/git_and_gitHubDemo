package coreJava;

public enum Animal {
	DOG("dogy"), CAT("caty"), PIG("pigy");
	
	private String name1;

	private Animal(String name) {
		this.name1 = name;
	}

	public String getName() {
		return name1;
	}

	public String toString() {
		return "to string method "+name1;
	}
	

}
