
/**
 *
 * @author edwinfinch
 */
public class Main {
    static public void main(String helloThereMrClementHowAreYouToday[]){
        //Initialize array
        int[] squareArray = new int[10];
        //Set the array squares based on loop count
        for(int i = 0; i < 10; i++){
            squareArray[i] = i*i;
            //Output it
            System.out.println("The square of " + i + " is " + squareArray[i]);
        }
    }
}
