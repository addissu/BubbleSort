
public class ExtraCredit {
	//bubble sort 
	//compares the number next to it only so the sorting will have to continue 
	//through multiple times making sure its in order 
	//Big Oh is O(N^2) not as efficient 
	
	public static void main(String[] args) {
		
		int numbers [] = {4,8,3,5,1,9,7};
		int temp;
		boolean fixed = false;
		//loops through array until it is sorted in order from least to greatest
		while(fixed==false) {
			fixed=true;
		//loops through array 
		for(int i=0; i<numbers.length-1;i++) {
			//if first number is greater than the next number +1
			if(numbers[i] > numbers[i+1]) {
				//stores i+1 in temp variable
				temp = numbers[i+1];
				//swaps the numbers if i>i+1
				numbers[i+1] = numbers[i];
				numbers[i] = temp;
				//allows the while loop to be accessed until in order
				fixed=false;
			}
		}
		}
		//prints array 
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}

	}

}
