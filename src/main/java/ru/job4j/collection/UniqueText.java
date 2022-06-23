package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
        public static boolean isEquals(String originText, String duplicateText) {
            boolean rsl = true;
            String[] origin = originText.split(" ");
            String[] text = duplicateText.split(" ");
            HashSet<String> check = new HashSet<>();
            /* for-each origin -> new HashSet. */
            for (String a : origin) {
                check.add(a);
            }
            int checksize = check.size();
            for (String b : text) {
                check.add(b);
            }
            if (check.size() != checksize) {
                rsl = false;
            }
            /* for-each text -> hashSet.contains */
            return rsl;
        }
}
