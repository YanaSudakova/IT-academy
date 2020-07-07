package homework7;

public class EasySearch implements ISearchEngine {

    @Override
    public int search(String content, String word) {
        int count = 0;
        while (content.contains(word)){
            count++;
            content = content.substring(content.indexOf(word) + word.length());
        }
        return count;
    }
}
