package com.company;

import com.company.dcp.DCP282;
import com.company.dcp.DCP283;
import com.company.dcp.DCP290;

public class Main {

    public static void main(String[] args) {

        DCP290 dcp290 = new DCP290();
        dcp290.findMinimumSeq(new char[]{'R', 'G', 'B', 'G', 'G'});

        DCP283 dcp283 = new DCP283();
        dcp283.firstNRegularNumbers(15);

        DCP282 dcp282 = new DCP282();
        dcp282.containsPythagoreanTriplet(new int[]{5,3,4});
    }
}
