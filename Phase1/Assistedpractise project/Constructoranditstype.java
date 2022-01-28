package practiseAssisted1;

public class Constructoranditstype {
	int id;
	String name;
	public Constructoranditstype(String name, int id) {
    super();
    System.out.println("parameterized constructor");
    this.id=id;
    this.name = name;
	}
	public Constructoranditstype() {
		super();
		  System.out.println("Default constructor");
		
	}
	
    
	public static void main(String[] args) {
		Constructoranditstype C=new Constructoranditstype();
		  System.out.println(C.id+" "+C.name);
	}

}
