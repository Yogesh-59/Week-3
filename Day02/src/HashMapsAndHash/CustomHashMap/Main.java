package HashMapsAndHash.CustomHashMap;

public class Main {
    public static void main(String[] args) {
        BasicHashMap<String, Integer> hashMap = new BasicHashMap<>();

        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Value for 'two': " + hashMap.get("two"));

        hashMap.remove("two");
        System.out.println("Value for 'two' after deletion: " + hashMap.get("two"));
    }
}
