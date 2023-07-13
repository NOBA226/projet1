import java.util.TreeMap;
import java.util.Map;


public class App{
TreeMap<Integer, String> tm = new TreeMap<Integer,String>();

tm.put(3,"Julie");
tm.put(2,"Luc");
tm.put(1,"null");
tm.put(10,"Marc");

for (Map.Entry<Integer, String> ent : tm.entrySet())
{
    system.out.println("Cle : " + ent.getkey() + " / Valeur : "+ ent.getValue()); 
}
}
