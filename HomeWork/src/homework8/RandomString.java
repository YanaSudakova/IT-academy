package homework8;

//3. Написать класс с RandomString в котором будет один статический метод String random(int stringLength):
// 3.1. Параметр метода это количество символов которые должно быть в строке
// 3.2. Буквы в строке: Латиница, Кирилица, Пробел


import java.security.SecureRandom;

public class RandomString {

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final String characters = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIKLMNOPQRSTVXYZ ";

    public static String random(int stringLength) {

        StringBuilder random = new StringBuilder();


        for (int i = 0; i < stringLength; i++) {
            int randomCharIndex = RANDOM.nextInt(characters.length());
            random.append(characters.charAt(randomCharIndex));
        }


//        int leftLimit = 65; // A
//        int rightLimit = 255; // Я
//
//        Random random = new Random();
//
//        return random.ints(leftLimit, rightLimit + 1)
//                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
//                .limit(stringLength)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();

        return random.toString();
    }
}
