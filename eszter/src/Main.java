asd23

public class Main {
    public static void combination(int[] inputArray, int[] resultArray,int start, int end, int index, int r){
      if(r>index){
          for (int i = start; i <=end && end-i+1>=r-index; i++) {
              resultArray[index]=inputArray[index];
              combination(inputArray, resultArray, i+1, end, index+1, r);
          }
      }
    }
    public static void main(String[] args) {
        System.out.println("hello github");
        int r = 3;
        int resultArray[]=new int[r];
        int inputArray[] = {1, 2, 3, 4, 5};
        int n = inputArray.length;
        combination(inputArray, resultArray,0, n,0,r);

        for (int elem:resultArray) {
            System.out.println(elem);
        }
    }
}
