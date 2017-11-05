import java.util.HashSet;
import java.util.Set;

public class DistributeCandies_575 {
    static public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<Integer>();
        for (int count = 0; count < candies.length; count++){
            set.add(candies[count]);
        }

        if (candies.length / 2 > set.size()){
            return set.size();
        } else{
            return candies.length / 2;
        }
}

    public static void main(String[] args) {
        System.out.println(distributeCandies(new int[] {1,1, 2, 3}));
    }
}
