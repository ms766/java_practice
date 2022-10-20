
class MethodsEtc {
	
	public static void defined_method_before_main(){
		System.out.println("This method was defined before the main");
	}

	//MAIN METHOD OR MAIN FUNCTION
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		defined_method_after_main();
		System.out.println("sum method results: "+sum(2,3));
		defined_method_before_main();
		print(2022);
		print(2022.1f);
		print('A');
		print("This print method prints out a string");
		
		String result = getDurationString(315,1);
		System.out.println(result);
	}

	public static void defined_method_after_main(){
		System.out.println("This method was defined after the main");
	}

	public static int sum(int a, int b){
		return a+b;
	}

	//Method overloading-----------------------------
	public static void print(int a){
		System.out.println(a);
	}

	public static void print(float b){
		System.out.println(b);
	}

	public static void print(char c){
		System.out.println(c);
	}

	public static void print(String str){
		System.out.println(str);
	}
	//Method overloading-----------------------------

	//exercise
	public static String getDurationString(long mins,long secs){
		if (mins < 0){
			return "INVAILD VALUE";
		}else if(secs < 0 || secs > 59 ){
			return "INVAILD VALUE";
		}

		long hours = mins / 60;
		long remainMins = mins % 60;
		return hours + " h: "+remainMins+" m: "+secs+" s";

	}
}
