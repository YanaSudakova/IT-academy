package homework7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class WarAndPeace {
    public static void main(String[] args) {
        String filePath = "WarAndPeace.txt";

        String content = getStringFile(filePath).toLowerCase(); // привести всё к нижнему регистру

        EasySearch easySearch = new EasySearch();
        System.out.println("Слово \"война\" встречается " + easySearch.search(content,"война")+ " раз");
        System.out.println("Слово \"и\" встречается " + easySearch.search(content," и ")+ " раз");
        System.out.println("Слово \"мир\" встречается " + easySearch.search(content,"мир")+ " раз");

        String[] strings = content.split(" "); //все слова текста собираются в массив и разбиваются пробелами

        Set<String> set = new HashSet<>(Arrays.asList(strings));

        Map<String, Integer> counter = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++){

            String s = strings[i];
            if (counter.keySet().contains(s)){
                Integer count = counter.get(s) + 1;
                counter.put(s, count);
            }
            else
                counter.put(s, 1);
        }

        for (int j = 0; j < 12; j++) { // 12 потому что пропускаю пустоту и --
            Integer times = null;
            String topWord = "";
            for (String s : counter.keySet()){
                Integer i = counter.get(s);
                if (times == null)
                    times = i;
                if (i > times){
                    times = i;
                    topWord = s;
                }
            }
            if (!topWord.isEmpty() && !topWord.equals("--")) {
                System.out.println(topWord + " - " + times + " раз");
            }
            counter.put(topWord, 0);
        }

    }

    private static String getStringFile(String filePath) {
        ClassLoader classLoader = WarAndPeace.class.getClassLoader();
        File file = new File(classLoader.getResource(filePath).getFile());

        String content = null;
        try {
            content = new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
