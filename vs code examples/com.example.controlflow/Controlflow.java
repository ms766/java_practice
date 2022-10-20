class Controlflow {
	public static void main(String[] args) {
		switchrunner(2);
		String[] arrayStringList = {"str1","str2","str3"};
		forLoopExampleString(arrayStringList);
		int[] arrayIntList = {1,2,3};
		forLoopExampleInt(arrayIntList);
		whileLoop();

	}

	public static void switchrunner(int switchVal){
		switch(switchVal){
			case 1:
				System.out.println("one");
			// break;
			case 2:
				System.out.println("two");
			break;
			default:
				System.out.println("Invaild input");
				break;
		}
	}

	//takes in an Array
	public static void forLoopExampleString(String[] words){
		for (String word:words){
			System.out.println(word);
		}
	}

	public static void forLoopExampleInt(int[] numbers){
		for (int number:numbers){
			System.out.println(number);
		}
	}

	public static void whileLoop(){
		int i = 1;
		while(i <= 10 ){
			System.out.println(i);
			i++;
		}

		int j = 5;
		do{
			System.out.println(j);
			j--;
		}while(j != 0);
	}

	

}




	
