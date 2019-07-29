

public class Vowels {

    //My solution

    public int countVowels(String word) {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            word.toLowerCase();
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                vowelCount++;
            }

        }

        return vowelCount;
    }

    //Instructor solution



}
