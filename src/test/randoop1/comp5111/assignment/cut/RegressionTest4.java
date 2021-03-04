package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i ! ", "", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi! h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi! h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charSequence1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", "  h i ! \n   h i ! \n", "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n", pattern1, "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (int) (short) -1, charSequence3, 0, 339);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\n \n h i !  h i ! \n", "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int[] intArray3 = new int[] { '#', 16, 94 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 16, 94]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (-373));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", pattern1, " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.Object[] objArray1 = new java.lang.Object[] { 1.0f };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray1);
        java.lang.Class<?> wildcardClass3 = objArray1.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \n", "hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false, (-13), charSequence3, 7, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n", 219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 144 + "'", int3 == 144);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!hi! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", (-373));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 4, charSequence3, 91, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (-94), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n " + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray5 = new double[] { (byte) -1, (-19), 6, (byte) -1, 1.0f };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, -19.0, 6.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", "  h i ! \n   h i ! \n", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        char[] charArray6 = new char[] { '\r', '4', '\r', '4', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r4\r44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r4\r44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, 4, \r, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n   h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 655 + "'", int1 == 655);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, \n, h, i, !, i, \n, h, i, !, !, \n, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "\n\nh\ni\n!\n", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", 77, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!  h i ! ? ? h i ! hi!  h i ! ?hi!  h i ! ? ? h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", false, 16, (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", 22, 55);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\n\nh\ni\n!\n", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { " ", "\nhi!  h i ! \n", "  h i ! ", "\nhi!  h i ! \r", "\nhi!  h i ! " };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        char[] charArray9 = new char[] { '\000', '\n', 'a', '\n', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \n, a, \n, #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (-72), (java.lang.CharSequence) "\nhi!  h i ! \r", 23, (-70));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (java.lang.CharSequence) "\n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "  h i ! ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!  h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", " ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", pattern1, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (-70), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        char[] charArray6 = new char[] { ' ', '#', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        char[] charArray3 = new char[] { 'a' };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "  h i ! \n", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 1, 133);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \n", false, 63, (java.lang.CharSequence) " \n h i ! ", (-1), (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  ,  , h,  , i,  , !,  , \n,  , \n,  ,  , h,  , i,  , !,  , \n,  , \n,  ,  , h,  , i,  , !,  , \n, h, \n,  ,  , h,  , i,  , !,  , \n,  , \n,  ,  , h,  , i,  , !,  , \n, i, \n,  ,  , h,  , i,  , !,  , \n,  , \n,  ,  , h,  , i,  , !,  , \n, !, \n,  ,  , h,  , i,  , !,  , \n,  , \n,  ,  , h,  , i,  , !,  , \n, \n, \n,  ,  , h,  , i,  , !,  , \n]");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", "\n\nh\ni\n!\n", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i ! ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n  h i ! \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n", pattern1, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! ", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r" + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\nhi!  h i ! \r", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 86 + "'", int1 == 86);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", false, (int) '#', (java.lang.CharSequence) "\n \n h i !  h i ! \n", 12, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", pattern1, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70 + "'", int1 == 70);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!  h i ! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n " + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!  h i ! \n", "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-74) + "'", int3 == (-74));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, h, i, !,  , h,  , i,  , !,  , \n, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , h, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , i, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false, (int) '#', (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) '\000', 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 655 + "'", int3 == 655);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", false, (-74), (java.lang.CharSequence) "\nhi!  h i ! \n", 12, 223);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n  h i ! \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (-74));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (int) (short) 10, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", false, 339, (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-70), 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", "\n\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        int[] intArray4 = new int[] { (-91), 10, (byte) 100, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-91, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-86) + "'", int3 == (-86));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\nhi!\n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (int) '#', 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", pattern1, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi! h i ! ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        long[] longArray4 = new long[] { 'a', 4, 10L, 94 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 4, 10, 94]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n", "\n \n h i !  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        short[] shortArray1 = new short[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        char[] charArray8 = new char[] { '\000', '\n', 'a', '\n', '#', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \n, a, \n, #, \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r \n h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        char[] charArray12 = new char[] { ' ', '#', '#', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i ! ", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", 8, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\nhi!  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11) + "'", int3 == (-11));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "\n  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (java.lang.CharSequence) "\n \n h i !  h i ! \n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        float[] floatArray3 = new float[] { (-1), 22, 3 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 22.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n", "\nhi!  h i ! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi! h i ! ", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! ", "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! " + "'", str3, "  h i ! ");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (short) -1, (byte) 10, (byte) 100, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", " \n h i ! ", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        char[] charArray8 = new char[] { 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i ! ", pattern1, "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", " ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\nh\ni\n!\n\n", "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", 59, 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        float[] floatArray1 = new float[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\n \n h i !  h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n   h i ! \n", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \n", 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 4, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 163, 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        char[] charArray7 = new char[] { ' ', '#', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 0, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n", 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi! h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (java.lang.CharSequence) " \n", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        int[] intArray3 = new int[] { '#', 16, 94 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 16, 94]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", true, 63, (java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (int) (short) 0, (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        int[] intArray5 = new int[] { (short) 1, '\000', 94, (short) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 94, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 118 + "'", int3 == 118);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !?hi!  h i !  ?hi!  h i !  h i ! ?hi!  h i !  ?hi!  h i !  h i ! h?hi!  h i !  ?hi!  h i !  h i ! i?hi!  h i !  ?hi!  h i !  h i ! !?hi!  h i !  ?hi!  h i !  h i ! hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! h?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! i?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! !?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i !  ? h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n   h i ! \n", (-86), 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-11), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "\n  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        char[] charArray11 = new char[] { ' ', '#', '#', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n", (java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass26 = strArray7.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        short[] shortArray3 = new short[] { (byte) 100, (short) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        java.lang.Class<?> wildcardClass5 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", 18, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", true, (-12), (java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", 15, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "\nhi!\n", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (-159));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double[] doubleArray1 = new double[] { (short) 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        char[] charArray10 = new char[] { 'a', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        java.lang.Class<?> wildcardClass11 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n", (-13), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n", pattern1, "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int[] intArray5 = new int[] { (short) 1, '\000', 94, (short) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 94, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray13 = new char[] { ' ', '#', '#', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! ", "\n \n h i !  h i ! \n", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\n \n h i !  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", 74, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi! h i ! ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", false, 655, (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", 52, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (int) (byte) 100, 339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "hi!", "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n" + "'", str3, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!", (-12));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n", pattern1, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 100, (short) 1, (short) 1, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        java.lang.Class<?> wildcardClass13 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! ", pattern1, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", pattern1, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \n", "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", true, 63, (java.lang.CharSequence) "", 59, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", 74);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", "\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r", (java.lang.CharSequence) "  h i ! \n   h i ! \n", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        long[] longArray6 = new long[] { 'a', (byte) 100, ' ', '4', '4', (-1) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 32, 52, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        float[] floatArray4 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 503 + "'", int1 == 503);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", pattern1, "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int28 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str29 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean30 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 86, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "hi!\r", (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (int) (byte) 10, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int29 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean30 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int31 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", "  h i ! \n   h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", " \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", charSequence1, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !,  ,  , h,  , i,  , !,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i ! \r", "\nhi!  h i ! \n", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !,  ,  , h,  , i,  , !,  , \r,  , \n,  , h,  , i,  , !,  , h, i, !,  ,  , h,  , i,  , !,  , \n, h, i, !,  ,  , h,  , i,  , !,  , \r,  , \n,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charSequence1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, \n, i, \n, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", (-22), (-70));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi! h i ! \n", "\nhi!  h i ! ", "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        long[] longArray3 = new long[] { 72, 68, (-53) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[72, 68, -53]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \n   h i ! \n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!  h i ! ", "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! hi!\r   h i ! hi!\r", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! \n   h i ! \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , \n,  ,  ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 55 + "'", int3 == 55);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", 66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", true, 10, (java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (-159), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (-77));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 386 + "'", int1 == 386);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r" + "'", str3, "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \n   h i ! \n", (java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", false, 72, (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (int) '\r', (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass21 = strArray7.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", pattern1, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 223, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i !  h i ! \n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", false, 22, (java.lang.CharSequence) "\n", 203, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", 70, (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n  h i ! \n", (-72), (-373));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        long[] longArray1 = new long[] { 94 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[94]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  h i ! \n   h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!  h i ! \r \n h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! ", pattern1, "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false, (-159), (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", 6, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        char[] charArray6 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "hi!\r", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        char[] charArray6 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\nhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int28 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str28 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n h i ! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (int) (short) -1, 118);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", 22, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n", "\nhi!\nhi! h i ! \n", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int27 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 74);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n", "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false, 0, (java.lang.CharSequence) "\nhi!  h i ! ", 339, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        comp5111.assignment.cut.ToolBox.RegExTools regExTools10 = new comp5111.assignment.cut.ToolBox.RegExTools();
        float[] floatArray15 = new float[] { (byte) 10, (short) 100, 10L, (short) 1 };
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray15);
        java.lang.Object[] objArray18 = new java.lang.Object[] { charArray4, 10L, strArray7, regExTools10, floatArray15, true };
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(floatArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray15), "[10.0, 100.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n,  ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n, h,  ,  , h,  , i,  , !,  , \n, i,  ,  , h,  , i,  , !,  , \n, !,  ,  , h,  , i,  , !,  , \n, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", 60, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        char[] charArray6 = new char[] { ' ', '#', '#', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n  h i ! \n", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }
}

