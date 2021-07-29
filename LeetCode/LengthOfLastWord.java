import java.util.HashMap;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        if (s.isEmpty() || s.isBlank() == true)
            return 0;
        String[] split = s.split(" ");

        HashMap<Integer, String> vHashMap = new HashMap<>();

        for (int j = 0; j < split.length; j++) {

            vHashMap.put(j, split[j]);

        }

        int size = vHashMap.get(vHashMap.size() - 1).length();

        return size;

    }

    public static void main(String[] args) {

        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        lengthOfLastWord.lengthOfLastWord(" ");

    }

}
