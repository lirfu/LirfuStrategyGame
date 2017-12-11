package com.lirfu.testgraphs;


import com.lirfu.lirfugraph.*;

/**
 * Created by lirfu on 13.12.16..
 */
public class TestGraphs {
    public static void main(String[] args) {
        LinearGraph g1 = new LinearGraph("Linear graph");
        DualGraph g2 = new DualGraph("Dual graph");
        BarGraph g3 = new BarGraph("Bar graph");

        for (double i = -1; i <= 1; i+=0.1) {
            double y = i * Math.sin(i);

            g1.add(y);
            g2.add(y, y + y / 2);
            g3.add("" + i, y);
System.out.println(""+i);
        }

        new Window(new VerticalContainer(new Row(g1), new Row(g2), new Row(g3)), true, true);
    }
}
