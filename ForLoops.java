
public class ForLoops {
    public static void main(String[] args) {
        //Loop variable declaration, condition, change in integer
        //i variable inside code block
        //when i is >=15 stop loop
        for (int i = 0; i < 15; i++) {
            System.out.println("i="+i);
        }
        //when j equals 0 stop loop
        for (int j = 10; j > 0; j -= 2) {
            System.out.println("j="+j);
        }
        //k does not reach exact value of 0 but terminates at -2
        for (int k = 10; k > 0; k -= 3) {
            System.out.println("k="+k);
        }
    }
}