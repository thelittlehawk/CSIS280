package ba.edu.ssst.week12;

import java.security.MessageDigest;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {


        try {
//            Block block0 = new Block("Genesis block", "0", 1);
//            Block block1 = new Block("Genesis block", block0.getHash(), block0.getIndex() + 1);
//
//            System.out.println(block0.getHash());
//            System.out.println(block1.getHash());

            BlockChain blockChain = new BlockChain();
            blockChain.addNewBlock("Some string 1");
            blockChain.addNewBlock("Some string 2");
            blockChain.addNewBlock("Some string 3");
            blockChain.addNewBlock("Some string 4");
            blockChain.addNewBlock("Some string 5");
            blockChain.addNewBlock("Some string 6");
            blockChain.addNewBlock("Some string 7");

            Iterator<Block> it = blockChain.getBlocks().iterator();
            while(it.hasNext()) {
                System.out.println("H  - " + it.next().getHash());
                System.out.println("PH - " + it.next().getPreviousHash());
                System.out.println("================================================================================================");
            }
        } catch (Exception e) {
            System.out.println("Problem");
        }

//        it();

//        hashSet();

//        linkedSet();

//        treeSet();

//        {
//            "Key1": 100,
//            "Key2": 200,
//            "Key3": 300
//        }
//        Map<String, Integer> nasaMapa = new TreeMap<String, Integer>();
//        nasaMapa.put("Key1", 100);
//        nasaMapa.put("Key2", 200);
//        nasaMapa.put("Key3", 300);
//        nasaMapa.put("Key3", 400);
//        nasaMapa.put("Key3", 500);
//
////        System.out.println(nasaMapa.containsKey("Key1"));
////        System.out.println(nasaMapa.containsKey("Neki Key 2"));
////        System.out.println(nasaMapa.containsValue(200));
//
//        Iterator<String> it = nasaMapa.keySet().iterator();
//        while(it.hasNext()) {
//            String key = it.next();
//            System.out.println(key + " " + nasaMapa.get(key));
//        }
//
//        System.out.println("========================");
//
//        nasaMapa.put("Key2", 10000);
//
//        Iterator<String> it2 = nasaMapa.keySet().iterator();
//        while(it2.hasNext()) {
//            String key = it2.next();
//            System.out.println(key + " " + nasaMapa.get(key));
//        }
//
//        System.out.println("========================");
//
//        Iterator<Integer> itI = nasaMapa.values().iterator();
//
//        while(itI.hasNext()) {
//            System.out.println(itI.next());
//        }
    }

    private static void treeSet() {
        Set<Integer> ourSet = new TreeSet<Integer>();
        ourSet.add(10);
        ourSet.add(2);
        ourSet.add(800);
        ourSet.add(123);
        ourSet.add(72);
        ourSet.add(3290);
        ourSet.add(498);


        Iterator<Integer> it = ourSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void linkedSet() {
        Set<String> ourSet = new LinkedHashSet<String>();
        ourSet.add("Neki string 1");
        ourSet.add("Neki string 1234");
        ourSet.add("Neki string 100");
        ourSet.add("Neki string 12");
        ourSet.add("Neki string 200");
        ourSet.add("Neki string 123");

        Iterator<String> it = ourSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    private static void hashSet() {
        Set<String> ourSet = new HashSet<String>();
        ourSet.add("Neki string 1");
        ourSet.add("Neki string 1234");
        ourSet.add("Neki string 12");
        ourSet.add("Neki string 123");

        Iterator<String> it = ourSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    private static void it() {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("New String 1");
        strings.add("Lab");
        strings.add("SSST");
        strings.add("CS");

//        for (String s : strings) {
//            System.out.println(s);
//        }
//
//        for (int i = 0 ; i < strings.size() ; i++) {
//            System.out.print(strings.get(i));
//        }

        Iterator<String> it = strings.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
