import java.util.HashMap;

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] split = text.split(" ");

        int count = 0;
        if (brokenLetters.isEmpty()) {
            return count = split.length;
        }

        HashMap<Integer, Character> vMap = new HashMap<>();

        for (int i = 0; i < brokenLetters.length(); i++) {

            vMap.put(i, brokenLetters.charAt(i));

        }

        for (int i = 0; i < split.length; i++) {

            for (int j = 0; j < split[i].length(); j++) {

                if (vMap.containsValue(split[i].charAt(j)) == true) {

                    count++;
                    break;

                }
            }

        }

        if (count != split.length) {
            count = split.length - count;
        } else {

            count = 0;
        }
    

    return count;

    }

    public static void main(String[] args) {

        Solution sol = new Solution();
        sol.canBeTypedWords(
                "veikxddtjgpixjrux srxiqrczp cxaldqsvsxpzn xrlxovsjy ervh cdtxwnahcvj xazmhniydmzsseuhq htrsuiabtzcjglilehrpxqcadk ynls r pjkiwtcmvldcr t urevy fjmeutye gjnyd wv fueploq eol zofra xnwaxnwh lpckcgzfcslugpmu judahwebqnwtk gfttojiqcffstkcq nfxbw ugnviyeincmuzoosfy kdazdudaztlnj rqg umaohfgtvk i vfhdvuvbih falmmrke rv zsaqn oswdlfq eapt mnr swcoa jhmui t vkm tumfqvj ehcycfgzxjkhxhdbymmwxy xnsxxerahbrr silb rqmhfbyopev fstlsvpblocrvrheghvgiuqftknewskmhbk nchoj bo cxovzradanq fofsrtmnytq brcixelmzvdxmm",
                "wqchprenozi");
    }
}