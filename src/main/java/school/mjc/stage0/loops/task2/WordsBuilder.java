package school.mjc.stage0.loops.task2;

public class WordsBuilder {


    public void buildPhrase(char... chars) {
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s = s.concat(String.valueOf(chars[i]));
        }
        System.out.print(s);
    }
}
