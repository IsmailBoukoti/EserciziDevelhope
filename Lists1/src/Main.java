import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final List<String> cityNames;
        cityNames = Arrays.asList("Milano", "Torino","Roma");
        //cityNames.add("Bari"); We get an error because asList returns a fixed size list
        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);

        List<String> kingsOfRome = Arrays.asList();
        kingsOfRome.add("Romulus");
        kingsOfRome.add("Numa Pompilus");
        kingsOfRome.add("Tullus Hostillius");
        kingsOfRome.add("Ancus Marcius");
        kingsOfRome.add("Lucius Tarquinius Priscus");
        kingsOfRome.add("Servius Tullius");
        kingsOfRome.add("Lucius Tarquinius Superbus");

        System.out.println(kingsOfRome);
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println(Arrays.toString(kingsOfRomeArray));

        String[] array = new String[];
    }
}
