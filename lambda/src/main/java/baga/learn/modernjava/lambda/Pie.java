package baga.learn.modernjava.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Pie {
    private int weight;

    public static void main(String[] args) {
        List<Pie> pieList = new ArrayList<>();
        Pie pie1 = new Pie();
        pie1.setWeight(10);
        pieList.add(pie1);

        Pie pie2 = new Pie();
        pie2.setWeight(12);
        pieList.add(pie2);

        Pie pie3 = new Pie();
        pie3.setWeight(9);
        pieList.add(pie3);

        System.out.println("=== Menggunakan lambda function ===");
        pieList.sort((a1, a2) -> {
            return a2.getWeight() - a1.getWeight();
        });
        pieList.forEach(System.out::println);

        System.out.println("=== Menggunakan interface Comparator ===");
        pieList.sort(new PieComparator());
        pieList.forEach(System.out::println);
    }
}
