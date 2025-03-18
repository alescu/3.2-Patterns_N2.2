import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Newsletter {
    private static Map<Stockbroker, List<FinanTialInstitution>> newsLetterMap = new HashMap<>();

    public static void addBroker(Stockbroker stb){
        newsLetterMap.put(stb, new ArrayList<FinanTialInstitution>());
    }

    public static void addFinanTialInstitution(Stockbroker stb, FinanTialInstitution fininst){
        if (newsLetterMap.containsKey(stb)){
            newsLetterMap.get(stb).add(fininst);
        }else{
            System.out.println("Stockbroker don`t exists.");
        }
    }

    public static void publishCommunicate(Stockbroker stb, String news) {
        if (newsLetterMap.containsKey(stb)){
            System.out.println(" New information from " + stb.getName());
            System.out.println(" # "+news);
            for(FinanTialInstitution fini:newsLetterMap.get(stb)){
                fini.Update(stb, news);
            }
            System.out.println("\n");
        }else{
            System.out.println("Stockbroker don`t exists.");
        }
    }

}
