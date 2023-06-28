package module.Tovar;
import java.util.List;
import java.util.ArrayList;
import module.Tovar;

public class task1 {
    public static void main(String[] args) {
        Tovar tovar_1 = new Tovar("средний", '2', 5);
        Tovar tovar_2= new Tovar("высший", '2', 6);
        Tovar tovar_3 = new Tovar("высший", '1', 7);
        List<Tovar> ListTovar = new ArrayList<>();
        ListTovar.add(tovar_1);
        ListTovar.add(tovar_2);
        ListTovar.add(tovar_3);

        
        String search = "высший";  
        Set<String> setPrices = new HashSet<>();
                
        for (int i=0; i <ListTovar.size(); i++) {
            if (ListTovar.get(1).getName().equals(search)) {
                setPrices.add(ListTovar.get(i).getPrice());
            }
        }
                
        int max = 0;
        for (int i = 0; i < setPrices.length; i++) {
            if (setPrices[i] > max) {
                max = setPrices[i];
            }
        }
        System.out.println(max)
    }
}
