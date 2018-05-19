import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Textonim {

    private Map<String, String> map = new HashMap<String, String>();
    private List<String> resultList = new ArrayList<String>();

    public Textonim() {
       fillMap();
       map = Collections.unmodifiableMap(map);

    }

    public Map<String, String> getmap() {
        return map;
    }

    public List<String> getResultList() {
        return resultList;
    }



    public void execute(String textonim) {
        readFile(textonim);
        printExample(resultList);
    }

    List<String> readFile(String pattern) {
        try {
            FileReader fr = new FileReader("src/main/resources/slowa.txt");
            BufferedReader br = new BufferedReader(fr);
            String oneLine = null;
            while ((oneLine = br.readLine()) != null) {
                if (check(oneLine, pattern)) {
                    resultList.add(oneLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultList;
    }

    private void printExample(List<String> allResult) {
        System.out.println("Ilość pasujących textonimów: " + resultList.size());

        if (allResult.size() == 0) {
            System.out.println("Brak wyników");
        } else if (allResult.size() < 5) {
            for (String anAllResult : allResult) {
                System.out.println(anAllResult);
            }
        } else {
            System.out.println("Pięć przykładowych wyników: ");
            for (int i = 0; i < 5; i++) {
                int randomNumber = (int) (Math.random() * allResult.size());
                System.out.println(allResult.get(randomNumber));
            }
        }
    }

     boolean check(String oneLine, String pattern) {
        if (oneLine.length() < pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String currentLetter = oneLine.substring(i, i + 1);
            String currentPattern = pattern.substring(i, i + 1);
            if (!map.get(currentLetter).equals(currentPattern)) {
                return false;
            }
        }
        return true;
    }

    private void fillMap() {
        map.put("A", "2");
        map.put("a", "2");
        map.put("B", "2");
        map.put("b", "2");
        map.put("C", "2");
        map.put("c", "2");
        map.put("Ć", "2");
        map.put("ć", "2");
        map.put("Ą", "2");
        map.put("ą", "2");
        map.put("D", "3");
        map.put("d", "3");
        map.put("E", "3");
        map.put("e", "3");
        map.put("Ę", "3");
        map.put("ę", "3");
        map.put("F", "3");
        map.put("f", "3");
        map.put("G", "4");
        map.put("g", "4");
        map.put("H", "4");
        map.put("h", "4");
        map.put("I", "4");
        map.put("i", "4");
        map.put("J", "5");
        map.put("j", "5");
        map.put("K", "5");
        map.put("k", "5");
        map.put("L", "5");
        map.put("l", "5");
        map.put("Ł", "5");
        map.put("ł", "5");
        map.put("M", "6");
        map.put("m", "6");
        map.put("N", "6");
        map.put("n", "6");
        map.put("Ń", "6");
        map.put("ń", "6");
        map.put("O", "6");
        map.put("o", "6");
        map.put("Ó", "6");
        map.put("ó", "6");
        map.put("P", "7");
        map.put("p", "7");
        map.put("Q", "7");
        map.put("q", "7");
        map.put("R", "7");
        map.put("r", "7");
        map.put("S", "7");
        map.put("s", "7");
        map.put("Ś", "7");
        map.put("ś", "7");
        map.put("T", "8");
        map.put("t", "8");
        map.put("U", "8");
        map.put("u", "8");
        map.put("V", "8");
        map.put("v", "8");
        map.put("W", "9");
        map.put("w", "9");
        map.put("X", "9");
        map.put("x", "9");
        map.put("Y", "9");
        map.put("y", "9");
        map.put("Z", "9");
        map.put("z", "9");
        map.put("Ź", "9");
        map.put("ź", "9");
        map.put("Ż", "9");
        map.put("ż", "9");
    }
}
