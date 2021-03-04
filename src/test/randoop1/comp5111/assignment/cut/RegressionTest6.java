package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        char[] charArray7 = new char[] { 'a' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 22, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  , h, \n,  , \n,  , h,  , i,  , !,  , i, \n,  , \n,  , h,  , i,  , !,  , !, \n,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\nhi!  h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  , \r,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ", "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! " + "'", str3, " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! hi!\r   h i ! hi!\r", "\nhi!  h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!", "", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        char[] charArray9 = new char[] { 'a' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", pattern1, "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n h i !  h i ! \n", " \n h i ! ", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!hi! h i !  h i ! \n" + "'", str3, "\n\nhi!hi! h i !  h i ! \n");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 86, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "  h i ! hi!\r   h i ! hi!\r", "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        float[] floatArray2 = new float[] { (short) -1, 94 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n h i !  h i ! \n", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        short[] shortArray3 = new short[] { (byte) 100, (short) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i ! ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int[] intArray4 = new int[] { '#', 1, ' ', 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 1, 32, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charSequence1, (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        short[] shortArray1 = new short[] { (short) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ", 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        char[] charArray7 = new char[] { ' ', '#', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  , h, \n,  , \n,  , h,  , i,  , !,  , i, \n,  , \n,  , h,  , i,  , !,  , !, \n,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean[] booleanArray5 = new boolean[] { true, false, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 10, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r" + "'", str3, "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 637);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!  h i ! \r \n h i ! ", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi! h i ! \n", pattern1, "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 0, (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i !  h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", " \n h i ! ", "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! ", pattern1, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", pattern1, "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        long[] longArray1 = new long[] { 9 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[9]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        char[] charArray8 = new char[] { 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
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
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double[] doubleArray2 = new double[] { 10L, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\r", false, 39, (java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", 386, 68);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \n", " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "  h i ! ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i ! ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.lang.String str30 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-797) + "'", int3 == (-797));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        short[] shortArray6 = new short[] { (byte) 100, (byte) 100, (short) 100, (short) 1, (short) 1, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        java.lang.Class<?> wildcardClass11 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 100, 100, 1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!hi! h i ! ", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 23 + "'", int18 == 23);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n", pattern1, "\n\nhi!hi! h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!", true, (-22), (java.lang.CharSequence) " \n h i ! ", (int) ' ', (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", pattern1, "\n\nhi!hi! h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 13, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        boolean[] booleanArray4 = new boolean[] { true, false, true, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        java.lang.Class<?> wildcardClass8 = charArray7.getClass();
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n h i ! ");
        java.lang.Object[] objArray11 = new java.lang.Object[] { booleanArray4, wildcardClass8, " \n h i ! " };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray11);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[true, false, true, false], class [C,  \n h i ! ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! ", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        java.lang.Class<?> wildcardClass20 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", true, 60, (java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 386, (-8));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 134);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", (java.lang.CharSequence) "", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-797));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        java.lang.String str22 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (-53), 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n", (java.lang.CharSequence) "\nhi!\n", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass11 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (-3), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \n", false, (int) '#', (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", 19, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 169, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!hi! h i !  h i ! \n", "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!hi! h i !  h i ! \n" + "'", str3, "\n\nhi!hi! h i !  h i ! \n");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
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
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        int int30 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        java.lang.String str31 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", " \n h i ! ", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n  h i ! \n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "  h i ! hi!\r   h i ! hi!\r", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
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
        java.lang.String str30 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean31 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n", (java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n", "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r" + "'", str3, "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        char[] charArray7 = new char[] { 'a' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        float[] floatArray1 = new float[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 163);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", 603, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", "\nhi!\nhi! h i ! \n", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n", 5, (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n  h i ! \n", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (int) '4', 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, h, i, !,  , h,  , i,  , !,  , \n, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , h, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , i, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi! h i ! ", "\nhi!  h i ! \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", false, 5, (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 386, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (int) '4', (-70));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 164, 339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !, h, \n, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !, i, \n, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !, !, \n, h, i, !, h, i, !, \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, h, h, i, !, h, i, !, i, h, i, !, h, i, !, !, h, i, !, h, i, !]");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i ! ", 25, (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi! h i ! \n", pattern1, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        char[] charArray12 = new char[] { 'a' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n", charArray12);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n", charArray12);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray12);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "  h i ! \n   h i ! \n", 603);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        char[] charArray8 = new char[] { '\000', '\n', 'a', '\n', '#', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \n, a, \n, #, \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        char[] charArray7 = new char[] { 'a' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r \n h i ! ", "  h i ! hi!\r   h i ! hi!\r", "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", false, 68, (java.lang.CharSequence) "  h i ! \n   h i ! \n", (-55), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str23 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!  h i ! ????hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! h???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! i???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! !???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (int) (short) 1, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 582 + "'", int11 == 582);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! ", 100, (-74));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\n", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n", (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        char[] charArray6 = new char[] { 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", 9, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n  h i ! \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi! h i ! \n", "\nhi!hi! h i ! ", "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        char[] charArray10 = new char[] { 'a', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        float[] floatArray3 = new float[] { '\n', (byte) 10, 94 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        char[] charArray6 = new char[] { 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", "\nhi!hi! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 223 + "'", int1 == 223);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", false, (int) '\r', (java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 163, 163);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        float[] floatArray6 = new float[] { 0.0f, 1.0f, 1.0f, (-1), (short) 10, 94 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 1.0, 1.0, -1.0, 10.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!hi! h i !  h i ! \n", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!hi! h i !  h i ! \n" + "'", str3, "\n\nhi!hi! h i !  h i ! \n");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n " + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 203);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n  h i ! \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, h, \n, i, \n, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n", pattern1, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        long[] longArray3 = new long[] { (byte) 100, 0, (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! h???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! i???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! !???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  ???hi!  h i ! ? h i ! ????hi!  h i ! ? h i ! ?  h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { 'a', '4', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? h i ! ? ? h i !   ? h i ! ? ? h i !   ? h i ! h ? h i !   ? h i ! i ? h i !   ? h i ! ! ? h i !   ? h i !   ? h i ! h ? h i !   ? h i ! i ? h i !   ? h i ! ! ? h i !   ? h i ! ? ? h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n  h i ! \n");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  ,  , h,  , i,  , !,  , \n]");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ", 25, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ", pattern1, "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! " + "'", str3, "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        long[] longArray4 = new long[] { 'a', 4, 10L, 94 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 4, 10, 94]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 203 + "'", int3 == 203);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ", "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! " + "'", str3, " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi! h i ! \n", pattern1, "\n\nhi!hi! h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! " + "'", str3, "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n" + "'", str3, "\n\nh\ni\n!\n\n");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", " ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!h\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!i\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!hi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!h\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!i\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!hi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!  h i ! \rhi!\r \nhi!  h i ! \rhi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!  h i ! ?hi!? ?hi!  h i ! ?hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", 169, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\r", 144);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n", pattern1, " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\rhi!\r hi!\r\nhi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\rhhi!\rihi!\r!hi!\r\nhi!\rhhi!\rihi!\r!hi!\r hi!\rhhi!\r hi!\rihi!\r hi!\r!hi!\r hi!\r\nhi!\r", 13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 164, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n", 12, 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nhhi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nihi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nhhi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nihi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", false, 100, (java.lang.CharSequence) "\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!h\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!i\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!hi!\nhhi!\nihi!\n!hi!\n", 507, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 10, (short) 0, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", "\nhi!\nhi! h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n  h i ! \n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        char[] charArray11 = new char[] { 'a', '4', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray11);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n  h i ! \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        char[] charArray7 = new char[] { 'a' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", 3, 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i ! ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\rh\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\ri\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r!\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", true, 16, (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (-53), 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ", pattern1, "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\r", 582);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", false, (int) (byte) 1, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (-25), 66);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        double[] doubleArray1 = new double[] { (short) 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        long[] longArray6 = new long[] { 'a', (byte) 100, ' ', '4', '4', (-1) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 32, 52, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int[] intArray1 = new int[] { (byte) 10 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!hi! h i !  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!hi! h i !  h i ! \n" + "'", str3, "\n\nhi!hi! h i !  h i ! \n");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n", 637);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charArray5);
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
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 15, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int28 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int29 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 133, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", "\n  h i ! \n", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!h\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!i\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!!\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", 169, 655);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n", true, 34, (java.lang.CharSequence) "\nhi!  h i ! ", (-55), (-373));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", 308);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (-63), (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nhhi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nihi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", 169, 354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean[] booleanArray5 = new boolean[] { false, true, false, true, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!h\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!i\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!hi!\nhhi!\nihi!\n!hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! ", (-373));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! ", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi! \n h i !  \nhi! \n h i !  h i ! \nhi! \n h i !  \nhi! \n h i !  h i ! h\nhi! \n h i !  \nhi! \n h i !  h i ! i\nhi! \n h i !  \nhi! \n h i !  h i ! !\nhi! \n h i !  \nhi! \n h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi! \n h i !  \nhi! \n h i !  h i ! \nhi! \n h i !  \nhi! \n h i !  h i ! h\nhi! \n h i !  \nhi! \n h i !  h i ! i\nhi! \n h i !  \nhi! \n h i !  h i ! !\nhi! \n h i !  \nhi! \n h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i ! \n h i ! ");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "hi!\r\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { 'a' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass23 = strArray7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n   h i ! \n", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!h\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!i\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!\n\n\nhi!hi!\n\n\n\nhi!hi!\nhi!hi!hi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n", pattern1, "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", 637, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! " + "'", str3, "\n\n\nhi!\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i !  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 582, 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!hi! h i !  h i ! \n", (java.lang.CharSequence) " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        long[] longArray6 = new long[] { 'a', (byte) 100, ' ', '4', '4', (-1) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 32, 52, 52, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! ", pattern1, "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        float[] floatArray2 = new float[] { 0, 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", true, 91, (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 203, (-53));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, h, \n, h, i, !, i, \n, h, i, !, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i !   h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass17 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int27 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!  h i ! \r\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! h\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! i\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! !\n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  \n\n\nhi!  h i ! \r h i ! \n\n\n\nhi!  h i ! \r h i ! \n  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 94, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", " \n h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i !  \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!hi! h i ! ", "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\n \n h i !  h i ! \n \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!\n \n h i !  h i ! \n \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-164) + "'", int3 == (-164));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 144);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        java.lang.String str28 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        char[] charArray7 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nhhi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \nihi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n h i ! \n \n h i !   \n h i ! \n \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i !   \n h i ! h \n h i !   \n h i ! i \n h i !   \n h i ! ! \n h i !   \n h i ! \n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }
}

