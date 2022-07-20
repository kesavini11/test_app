public class Constructor {
	int modelyear;
	String modelname;
	
	public Constructor(int year, String name) {
		modelyear = year;
		modelname = name;
	}
	
	public static void main(String[] args) {
		Constructor bike = new Constructor(1980, "Pulsar");
		System.out.println(bike.modelyear + " " + bike.modelname);
	}
}
