package SectionB;

public class WordContainer implements Comparable<WordContainer> {
    String str;

    public WordContainer(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str + " ";
    }

    @Override
    public int compareTo(WordContainer obj) {
        if (this.str.length() > obj.str.length()) {
            return 1;
        } else if (this.str.length() < obj.str.length())
            return -1;
        return 0;
    }
}
