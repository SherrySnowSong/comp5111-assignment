package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!", false, 2, (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", 76, (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 51, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 92 + "'", int1 == 92);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", pattern1, "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, (int) (byte) -1, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (int) 'a', 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!", true, (-72), (java.lang.CharSequence) "\n\r\n", 22, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nhi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        long[] longArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 106, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\nhi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 42 + "'", int3 == 42);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!\n\rhi!", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!", pattern1, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (short) 100, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass9 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!", true, (int) '#', (java.lang.CharSequence) "hi!\nhi!hi!", (int) '\r', 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 95, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 6, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, (-7), (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-7), 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70) + "'", int3 == (-70));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!", true, 102, (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 91, (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (int) '#', (java.lang.CharSequence) "\rhi!", (-7), (-51));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true, 42, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (int) '\000', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 42, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) " \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " ", 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) '\000', 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", false, 90, (java.lang.CharSequence) " \n h i !   ", (-106), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "", " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 4, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", false, (int) ' ', (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 164, 92);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", 9, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", 40, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "hi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 267);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-158), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\rhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        boolean[] booleanArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\n", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "hi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!", 2, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false, (-267), (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (-22), 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        float[] floatArray2 = new float[] { (short) 10, (-72) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass4 = floatArray2.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, -72.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\nhi!hi!", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!hi!", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\n" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!?hi!?hi!hhi!?hi!ihi!?hi!!hi!?hi!?hi!hi!?hi!?hi!?hi!hhi!?hi!ihi!?hi!!hi!?hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-267));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!\nhi!", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\nhi!", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????????????h???i???!???h???????????????h???i???!???i???????????????h???i???!???!???????????????h???i???!???????????????????h???i???!???h???????????????h???i???!???i???????????????h???i???!???!???????????????h???i???!???h???????????????h???i???!???i???????????????h???i???!???!???????????????h???i???!???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        java.lang.Class<?> wildcardClass3 = longArray0.getClass();
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "\n\r\nhi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rhi!\n\rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\nhi!\nhi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nhi! ", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\rhi!\n\rhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!", "\rhi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "hi!", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true, 94, (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 106, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        java.lang.Class<?> wildcardClass10 = booleanArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\rhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false, 267, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-70), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", " ", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!", "\nhi!hi!\nhi!\nhi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!" + "'", str3, "\rhi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", true, (int) '\r', (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 12, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", true, 6, (java.lang.CharSequence) "hi!\nhi!", (-5), 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 7, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        char[] charArray11 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\nhi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "\r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", pattern1, "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", true, 15, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (int) '4', 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false, 164, (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-22), (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!??hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! ", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", true, (-12), (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", 0, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 7, 267);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, 39, (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 4, 102);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray9);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", " \n h i !   ", "hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!", charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", true, (-5), (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 22, 51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!", (int) (byte) -1, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "hi!\nhi!\nhi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!", "", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n h i !   ", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (java.lang.CharSequence) "\r", (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false, 42, (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!", 9, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \r, \n, h, i, !, h, i, !]");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", 95, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 40, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-14), (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 38, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, i, !, \n, \r, h, i, !]");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!", "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", " \n h i !   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) " ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", (-106), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!", pattern1, "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi! ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true, 2, (java.lang.CharSequence) "\nhi! ", (int) '\n', 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true, (-39), (java.lang.CharSequence) "\rhi!\n\rhi!", 22, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!", "\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", false, (-3), (java.lang.CharSequence) "\n\nhi!", (-5), (-70));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!", false, 72, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (int) '4', (-267));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!", "\rhi!\n\rhi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? h i !   ? ? h i !   h ? h i !   i ? h i !   ! ? h i !   ? ? h i !   h ? h i !   i ? h i !   ! ? h i !   h ? h i !   i ? h i !   ! ? h i !   ? ? h i !   ? ? h i !   ? ? h i !   ? ? h i !   h ? h i !   i ? h i !   ! ? h i !   h ? h i !   i ? h i !   ! ? h i !   h ? h i !   i ? h i !   ! ? h i !   ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-92) + "'", int3 == (-92));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) " \n h i !   ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 164 + "'", int1 == 164);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi! \n h i !   \nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!", " \n h i !   ", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        long[] longArray6 = new long[] { (byte) 100, (-1L), (short) 10, '#', '#', '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, -1, 10, 35, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        long[] longArray6 = new long[] { (byte) 100, (-1L), (short) 10, '#', '#', '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, -1, 10, 35, 35, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "hi!\nhi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) " ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\nhi!hi!", "\nhi! ", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass12 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\n\r\n", "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "\n\r\n", "\n\r\nhi!", "\n\r\n", "\n\r\nhi!", "\nhi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        java.lang.Class<?> wildcardClass10 = charSequenceArray6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", false, (int) ' ', (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 38, 70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! ", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 307, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\nhi!", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "\rhi!\n\rhi!", "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false, 0, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-158), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", pattern1, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", false, 102, (java.lang.CharSequence) " ", 12, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "\n", "\n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n h i !   ", false, (int) (short) -1, (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 24, 21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", pattern1, "hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (-22), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hi!", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!" + "'", str3, "hi!\nhi!hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (-39), (java.lang.CharSequence) "\nhi!\r\nhi!hi!", 15, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !, \n, \n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !]");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?h?i?!???h?i?!?h?i?!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '\000', 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-22), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, (-39), (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 0, (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true, (int) '#', (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (-7), 56);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", 70, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", 24, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\n\rhi!", "\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!???hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 307);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 0, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 16, 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 21, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "\rhi!\n\rhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", 7, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-12), 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\rhi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", " \n h i !   ", "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !, \n, \n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !, h, \n, \r, \n, h, i, !, i, \n, \r, \n, h, i, !, !, \n, \r, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n", 106);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", pattern1, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n", "hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-158));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", (int) (short) 10, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????hi!hi!hi!????hi!????hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\rhi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", 51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 15, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-48) + "'", int3 == (-48));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", true, (-91), (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-14), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-70));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\nhi!hi!", " ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

