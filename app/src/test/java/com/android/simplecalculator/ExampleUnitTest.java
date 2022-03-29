package com.android.simplecalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {


    @Test
    public void addTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("10","100", Calculator.Operator.ADD));
        assertEquals(addTest01, 110,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("1000","1000", Calculator.Operator.ADD));
        assertEquals(addTest02, 2000.5,1);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("1000000","10000", Calculator.Operator.ADD));
        assertEquals(addTest03, 1010000,0.1);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("1111.5","2222.5", Calculator.Operator.ADD));
        assertEquals(addTest04, 3334.5,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("-11115","22", Calculator.Operator.ADD));
        assertEquals(addTest05, -11093,0.75);

    }

    @Test
    public void subTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("10000","100", Calculator.Operator.SUB));
        assertEquals(addTest01, 9900,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("-1000","1000", Calculator.Operator.SUB));
        assertEquals(addTest02, -2000.25,0.75);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("1000.0005","10005550", Calculator.Operator.SUB));
        assertEquals(addTest03, -10004550,0.75);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("111144445","22224445", Calculator.Operator.SUB));
        assertEquals(addTest04, 88920000,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("-1111522222","2444", Calculator.Operator.SUB));
        assertEquals(addTest05, -1111524666,0.25);

    }

    @Test
    public void mulTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("100","100", Calculator.Operator.MUL));
        assertEquals(addTest01, 10000,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("-1000","1000", Calculator.Operator.MUL));
        assertEquals(addTest02, -1000000.5,0.75);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("1000.05","150", Calculator.Operator.MUL));
        assertEquals(addTest03, 150007.25,0.5);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("111145","2222", Calculator.Operator.MUL));
        assertEquals(addTest04, 246964190,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("-11152","444", Calculator.Operator.MUL));
        assertEquals(addTest05, -4951488.1,0.25);

    }

    @Test
    public void divTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("100","100", Calculator.Operator.DIV));
        assertEquals(addTest01, 1,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("-10003","1000", Calculator.Operator.DIV));
        assertEquals(addTest02, -10.003,0.5);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("1000.05","150", Calculator.Operator.DIV));
        assertEquals(addTest03, 6.667,0.8);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("111145","22", Calculator.Operator.DIV));
        assertEquals(addTest04, 5052.045455,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("-11152","444", Calculator.Operator.DIV));
        assertEquals(addTest05, -25.11711712,0.01);

    }

    @Test
    public void expTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("100","2", Calculator.Operator.EXP));
        assertEquals(addTest01, 10000,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("100","-2", Calculator.Operator.EXP));
        assertEquals(addTest02, 0.0001,0.5);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("1000.5","3", Calculator.Operator.EXP));
        assertEquals(addTest03, 1001500750,0.8);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("14","3", Calculator.Operator.EXP));
        assertEquals(addTest04, 2744,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("-8","3", Calculator.Operator.EXP));
        assertEquals(addTest05, -512,0.01);

    }

    @Test
    public void logTwoNumbers()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("100","10", Calculator.Operator.LOGARIT));
        assertEquals(addTest01, 0.5,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("100","100", Calculator.Operator.LOGARIT));
        assertEquals(addTest02, 1,0.5);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("9","3", Calculator.Operator.LOGARIT));
        assertEquals(addTest03, 0.5,0.1);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("81","3", Calculator.Operator.LOGARIT));
        assertEquals(addTest04, 0.25,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("200","5", Calculator.Operator.LOGARIT));
        assertEquals(addTest05, 0.303763969,0.3);

    }

    @Test
    public void factorialNumber()
    {
        double addTest01 = Double.parseDouble(Calculator.getInstance().doCalculate("3","1", Calculator.Operator.FACTORIAL));
        assertEquals(addTest01, 6,0.1);

        double addTest02 = Double.parseDouble(Calculator.getInstance().doCalculate("5","1", Calculator.Operator.FACTORIAL));
        assertEquals(addTest02, 120,0.5);

        double addTest03 = Double.parseDouble(Calculator.getInstance().doCalculate("9","1", Calculator.Operator.FACTORIAL));
        assertEquals(addTest03, 362880,0.1);

        double addTest04 = Double.parseDouble(Calculator.getInstance().doCalculate("11","1", Calculator.Operator.FACTORIAL));
        assertEquals(addTest04, 39916800,0.5);

        double addTest05 = Double.parseDouble(Calculator.getInstance().doCalculate("8","1", Calculator.Operator.FACTORIAL));
        assertEquals(addTest05, 40320,0.3);

    }

}