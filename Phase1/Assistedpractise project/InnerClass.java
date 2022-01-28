package practiseAssisted1;



	public class InnerClass {
		private String msg="Inner Classes";
		void display() {
			class Inner{
				void msg() {
					System.out.println(msg);
				}
			}
			Inner i=new Inner();
			i.msg();
		}
			
	public static void main(String[] args) {
		InnerClass ic=new InnerClass();
		ic.display();
		}
	}
