package practiseAssisted1;
 class Returntype {
	public static int square(int num) {
		return num * num;
	}
	public static int Add(int a,int b) {
		return a+b;
	}
	public static int Substraction(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		int result;
		result = square(10);
		System.out.println("Square value of 10 is: "+ result);
		int sum;
		sum=Add(5,5);
		System.out.println("Addition value of is: "+ sum);
		int sub;
		sub=Substraction(2,1);
		System.out.println("Substraction value of is: "+ sub);
	}
 }