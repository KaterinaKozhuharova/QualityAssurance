public class Task2 {

    public static void main(String[] args) {

    int[] myArray=new int[]{8,2,5,1,6,4};
    int sum=0;
    int avg = 0;

      for (int i=0;i< myArray.length;i++){
      sum=sum+myArray[i];
      avg=sum/6;

      }
      System.out.println("The average is: "+avg);
    }
}


