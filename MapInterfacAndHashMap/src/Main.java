import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // map ve collaction aynı mantıkta calısıyor ayrı konular
        //hashmap sifreleme verinin sırası yok 3 farklı yapı görecegiz.
        HashMap<String, String> county = new HashMap<>();
        county.put("Tr", "türkiye");
        county.put("gr", "Almanya");
        county.put("En", "ingiltere");
        county.put("fr", "fransa");
        // tr arayıp türkiyyi bularızı indix  numarası yerine kodlamayı sağladık.
        System.out.println(county.get("Tr")); // deger yoksa null
        // degiltirmek için tr uzantılı farklı bir sey oluşturabiliriz.
        // itr yok forech
        for(String countrykey : county.keySet()){
            System.out.println(countrykey); // index gibi sıralaması sıra garantisi yok
            System.out.println(county.get(countrykey));
        }
        for (String countyvalue: county.values()) {
            System.out.println(countyvalue);

        }
    }
}