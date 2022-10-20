import java.util.Scanner;


class InputChal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int min = 0;
		int max = 0;

		while(true){
			System.out.print("Enter a number:");
			boolean isInt = scanner.hasNextInt();

			if(isInt != false){
				int number = scanner.nextInt();

				if (max == 0 && min == 0){
					max = number;
					min = number;
				}

				if (number < max){
					max = number;
				}

				if (number > min){
					min = number;
				}

				
			}else{
				System.out.println("max: "+max+" min "+min);
				break;
				
			}
		
		}


		
	}
}
