package SectionB;

import java.util.Comparator;

public class FOR_COMPARE implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int value1 = checkWord((WordContainer) o1);

        int value2 = checkWord((WordContainer) o2);

        if (value1 > value2)
            return 1;
        else if (value1 < value2)
            return -1;
        return 0;
    }

    public int checkWord(WordContainer obj) {
        int l = obj.str.length();
        int value = 0;
        for (int i = 0; i < l; i++) {
            value += (int) obj.str.charAt(i) * Math.pow(10,(l-(l-i)+1));
        }
        return value;
    }

//    @Override
//    public int compare(Object o1, Object o2) {
//        return 0;
//    }
}
