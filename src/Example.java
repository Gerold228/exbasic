import java.util.Arrays;
import java.util.List;

public class Example {
    public static List<Integer> reverse(List<Integer> numlist){
        int list_size = numlist.size();
        int num;
        for (int i = 0; i < list_size/2; i++){
            num = numlist.get(i);
            numlist.set(i, numlist.get(list_size-i-1));
            numlist.set(list_size-i-1, num);
        }
        return numlist;
    }
    public static void main(String[] args){
        List<Integer> numlist = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(reverse(numlist));
    }
}
