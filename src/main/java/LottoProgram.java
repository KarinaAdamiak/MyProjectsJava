import java.util.ArrayList;
import java.util.Collections;


public class LottoProgram {


    public static void main (String [] args) {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 1;i<=49; i++ ){
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=1; i<7; i++){
            System.out.println(list.get(i));

    }}}
