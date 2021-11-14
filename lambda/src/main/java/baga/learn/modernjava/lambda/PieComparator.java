package baga.learn.modernjava.lambda;

import java.util.Comparator;

public class PieComparator implements Comparator<Pie> {
    @Override
    public int compare(Pie o1, Pie o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
