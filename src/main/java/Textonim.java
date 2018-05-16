import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Textonim {

    private Map<String, String> MAP = new HashMap<String, String>();
    private List<String> resultList = new ArrayList<String>();

    public Map<String, String> getMAP() {
        return MAP;
    }

    public List<String> getResultList() {
        return resultList;
    }

    public void execute(String textonim) {
        fillMap();
        readFile(textonim);
        printExample(resultList);
    }

    public List<String> readFile(String pattern) {
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

    public void printExample(List<String> allResult) {
        System.out.println("Ilość pasujących textonimów: " + resultList.size());

        if (allResult.size() == 0) {
            System.out.println("Brak wyników");
        } else if (allResult.size() < 5) {
            for (int i = 0; i < allResult.size(); i++) {
                System.out.println(allResult.get(i));
            }
        } else {
            System.out.println("Pięć przykładowych wyników: ");
            for (int i = 0; i < 5; i++) {
                int randomNumber = (int) (Math.random() * allResult.size());
                System.out.println(allResult.get(randomNumber));
            }
        }
    }

    public boolean check(String oneLine, String pattern) {
        if (oneLine.length() < pattern.length()) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            String currentLetter = oneLine.substring(i, i + 1);
            String currentPattern = pattern.substring(i, i + 1);
            if (!MAP.get(currentLetter).equals(currentPattern)) {
                return false;
            }
        }
        return true;
    }

    public void fillMap() {
        MAP.put("A", "2");
        MAP.put("a", "2");
        MAP.put("B", "2");
        MAP.put("b", "2");
        MAP.put("C", "2");
        MAP.put("c", "2");
        MAP.put("ć", "2");
        MAP.put("Ą", "2");
        MAP.put("ą", "2");
        MAP.put("D", "3");
        MAP.put("d", "3");
        MAP.put("E", "3");
        MAP.put("e", "3");
        MAP.put("Ę", "3");
        MAP.put("ę", "3");
        MAP.put("F", "3");
        MAP.put("f", "3");
        MAP.put("G", "4");
        MAP.put("g", "4");
        MAP.put("H", "4");
        MAP.put("h", "4");
        MAP.put("I", "4");
        MAP.put("i", "4");
        MAP.put("J", "5");
        MAP.put("j", "5");
        MAP.put("K", "5");
        MAP.put("k", "5");
        MAP.put("L", "5");
        MAP.put("l", "5");
        MAP.put("Ł", "5");
        MAP.put("ł", "5");
        MAP.put("M", "6");
        MAP.put("m", "6");
        MAP.put("N", "6");
        MAP.put("n", "6");
        MAP.put("Ń", "6");
        MAP.put("ń", "6");
        MAP.put("O", "6");
        MAP.put("o", "6");
        MAP.put("Ó", "6");
        MAP.put("ó", "6");
        MAP.put("P", "7");
        MAP.put("p", "7");
        MAP.put("Q", "7");
        MAP.put("q", "7");
        MAP.put("R", "7");
        MAP.put("r", "7");
        MAP.put("S", "7");
        MAP.put("s", "7");
        MAP.put("Ś", "7");
        MAP.put("ś", "7");
        MAP.put("T", "8");
        MAP.put("t", "8");
        MAP.put("U", "8");
        MAP.put("u", "8");
        MAP.put("V", "8");
        MAP.put("v", "8");
        MAP.put("W", "9");
        MAP.put("w", "9");
        MAP.put("X", "9");
        MAP.put("x", "9");
        MAP.put("Y", "9");
        MAP.put("y", "9");
        MAP.put("Z", "9");
        MAP.put("z", "9");
        MAP.put("Ź", "9");
        MAP.put("ź", "9");
        MAP.put("Ż", "9");
        MAP.put("ż", "9");
    }
}
