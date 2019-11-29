package weekly.assignments;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		String [] array=text.split(" ");
for (int i = 0; i < array.length; i++) {
	if (array[i]!="") {
		
	
	
for (int k = i+1; k < array.length; k++) {
	if (array[i].equals(array[k])) {
		count=count+1;
				if (count >= 1) {
			array [k]="";
		}
	}

}
	}
}

for (int l = 0; l < text.length(); l++) {

	System.out.println(array[l]);
}
	}

}
