package dev.yavuztas.samples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A solution to challenge:
 * https://leetcode.com/problems/reorder-data-in-log-files/
 */
public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        List<String> list = Arrays.asList(logs);

        Collections.sort(list, (o1, o2) -> {
            String left = o1.substring(o1.indexOf(" ") + 1);
            String right = o2.substring(o2.indexOf(" ") + 1);

            boolean isLeftNumeric = String.valueOf(left.charAt(0)).matches("[0-9]");
            boolean isRightNumeric = String.valueOf(right.charAt(0)).matches("[0-9]");

            if (!isLeftNumeric && isRightNumeric) {
                return -1;
            }
            if (isLeftNumeric && !isRightNumeric) {
                return 1;
            }
            if (isLeftNumeric) {
                return 0;
            }

            int compare = left.compareTo(right);
            if (compare == 0) {
                String leftIdentifier = o1.substring(0, o1.indexOf(" "));
                String rightIdentifier = o2.substring(0, o2.indexOf(" "));
                return leftIdentifier.compareTo(rightIdentifier);
            }
            return compare;
        });


        return list.toArray(new String[0]);
    }

}
