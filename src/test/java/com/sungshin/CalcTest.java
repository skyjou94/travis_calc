package com.sungshin;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalcTest extends TestCase {
    public CalcTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( CalcTest.class );
    }

    public void testAdd() {
        Calc c = new Calc();
        assertEquals(30, c.add(10, 20));
    }

    public void testSub() {
        Calc c = new Calc();
        assertEquals(-10, c.sub(10, 20));
    }
}
