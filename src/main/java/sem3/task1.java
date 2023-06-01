//Пусть дан произвольный список целых чисел.
//
//1) Нужно удалить из него чётные числа
//2) Найти минимальное значение
//3) Найти максимальное значение
//4) Найти среднее значение
package sem3;
import java.util.ArrayList;
import java.util.*;
public class task1 {
    static Random rndList = new Random();
    static List<Integer> list1 = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            list1.add(rndList.nextInt(20));
        }
         System.out.println(list1);
        System.out.println(Collections.min(list1));
                for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.remove(i);
                i--;
            }
        }
        System.out.println(list1);

        // вывод среденего значения
        int sum = 0;
        for (int i = 0; i < list1.size(); i++){
            int num = list1.get(i);
            sum += num;
        }
        double avg = (double) sum / list1.size();
        System.out.println(avg);
    }

}