package hello;

public class hello {

    public static void main(String[] args) {
    	  int[] numbers = {1012,203,15,40,6,7,2,51,-5,55,-111};
          System.out.print("����ǰ��");
          printArr(numbers);
          
          bubbleSort(numbers);
          System.out.print("ð�������");
          printArr(numbers);

    }

	private static void bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
        int temp = 0;
        int size = numbers.length;
        for(int i = 0 ; i < size-1; i ++)
        {
        for(int j = 0 ;j < size-1-i ; j++)
        {
            if(numbers[j] > numbers[j+1])  //��������λ��
            {
            temp = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
            }
        }
        }
		
	}

	private static void printArr(int[] numbers) {
		// TODO Auto-generated method stub
        for(int i = 0 ; i < numbers.length ; i ++ )
        {
        System.out.print(numbers[i] + ",");
        }
        System.out.println("");
		
	}

}
