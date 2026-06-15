public class ClassTask {
    public static void main(String[] args){

        int[] numbers = {10,15,17,20,25,19};

        int maximumval1 = Integer.MIN_VALUE;
        int maximumval2 = Integer.MIN_VALUE;

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i]>maximumval1){
                maximumval2 = maximumval1;
                maximumval1 = numbers[i];
            }
            else if(numbers[i] > maximumval2){
                maximumval2 = numbers[i];
            }
        }
    System.out.println("The highest number in this array is " + maximumval1);
    System.out.println("The second highest number in this array is " + maximumval2);

        }
    }
