import java.util.ArrayList;
import java.util.Random;

public class task_4 {
    public static void main(String[] args) {
        Random rndm = new Random();
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            arrlist.add(rndm.nextInt(0,10));
        }
        System.out.println(arrlist.toString());
        int max = arrlist.get(0);
        int min = arrlist.get(0);
        int sum = 0;
        for(int i=0;i<arrlist.size();i++){
            if (arrlist.get(i)>max) max = arrlist.get(i);
            if (arrlist.get(i)<min) min = arrlist.get(i);
            sum=sum+arrlist.get(i);
        }
        System.out.printf("Максимальный элемент: %d\n",max);
        System.out.printf("Минимальный элемент: %d\n",min);
        System.out.printf("Среднее арифметическое: %.1f\n",((float)sum/arrlist.size()));


    }
}
