public class IndexOfArrayElement {
  
	/*method to sorting Array*/
	static void sortArray(int array[], int arrayLen) {
		int originalArray[]= {5,10,50,40,20};
		int row,col,temp;
		for(row=0;row<arrayLen;row++) {
			temp=0;
			for(col=row+1;col<arrayLen;col++) {
				if(array[row]>array[col]) {
					temp=array[row];
					array[row]=array[col];
					array[col]=temp;
				}
			}
		}
		compareArray(originalArray,array);
	}
	
	/*Checking the original array with sorted array*/
	static void compareArray(int originalArray[],int array[]) {
		for(int row=0;row<originalArray.length;row++) {
			for(int col=0;col<array.length;col++) {
				if(originalArray[row]==array[col]) {
					System.out.print(col+" ");
					break;
				}
			}
		}
	}
	
	/*Main method of java class*/
	public static void main(String args[]) {
		int array[]= {5,10,50,40,20};
		int arrayLen=array.length;
		sortArray(array, arrayLen);
	}

}
