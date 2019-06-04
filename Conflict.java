public static void main(string[] args){
  System.out.println("Hellowrold");
}

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i=0 ; i<10 ; i++) {
            int val = (int)(rnd.nextDouble() * 100.0);
            System.out.println((i+1) + "つ目:" + val);
        }
    }


        



	

}
