package com.sdz.testsUnitaires.test;

import com.sdz.testsUnitaires.main.Calculator;
import com.sdz.testsUnitaires.main.CalculatorImpl;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorImplTest {

    @Test
    public final void testMultiply() {
      Calculator calc = new CalculatorImpl();
      int a, b, res;

      a = 5;
      b = 5;
      res = a * b;
      assertTrue("a et b positifs",calc.multiply(a,b)==res);

      a = -5;
      b = -5;
      res = a * b;
      assertTrue("a et b négatifs",calc.multiply(a,b) ==res);
    }

    @Test
    public final void testDivide() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a et b positif");
        }
        a = 0;
        b  = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a nul");
        }
        a = -5;
        b  = 5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a negatif");
        }
        a = 5;
        b  = -5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("b negatif");
        }
        a = -5;
        b  = -5;
        res = a / b;
        if (calc.divide(a, b) != res) {
            fail("a et b negatif");
        }
    }

    @Test (expected = ArithmeticException.class)
    public final void testDivideByZero() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 0;
        res = 0;
        if (calc.divide(a, b) != res) {
            fail("b nul");
        }
        a = 0;
        b  = 0;
        res = 0;
        if (calc.divide(a, b) != res) {
            fail("a et b nuls");
        }
    }


    @Test
    public final void testAdd() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;
        a = 5;
        b  = 5;
        res = a + b;
        assertTrue("a et b positif", calc.add(a, b) == res);
        a = 0;
        b  = 5;
        res = a + b;
        assertTrue("a nul", calc.add(a, b) == res);
        a = 5;
        b  = 0;
        res = a + b;
        assertTrue("b nul", calc.add(a, b) == res);
        a = 0;
        b  = 0;
        res = a + b;
        assertTrue("a et b nuls", calc.add(a, b) == res);
        a = -5;
        b  = 5;
        res = a+ b;
        assertTrue("a negatif", calc.add(a, b) == res);
        a = 5;
        b  = -5;
        res = a + b;
        assertTrue("b negatif", calc.add(a, b) == res);
        a = -5;
        b  = -5;
        res = a + b;
        assertTrue("a et b negatif", calc.add(a, b) == res);
    }


    @Test
    public final void testSubstract() {
        Calculator calc = new CalculatorImpl();
        int a, b, res;

        a = 5;
        b = 2;
        res = a - b;
        assertTrue("a > b", calc.substract(a,b)==res);
    }

}