package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\n\r\n\n\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", " \n\r \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", 18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!hi!hi!??hi!??hi!?hi!??hi!?hi!hi!hi!hi!??hi!??hi!?hi!??hi!?hi!hi!hi!hi!??hi!??hi!?hi!??hi!?hi! hi!hi!hi!??hi!??hi!?hi!??hi!?hi!?h?i?!???h?i?!?h?i?!???h?h?i?!???h?i?!?h?i?!???i?h?i?!???h?i?!?h?i?!???!?h?i?!???h?i?!?h?i?!???hhi!ihi!!hi!?hi!hi!??hi!??hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        float[] floatArray2 = new float[] { (-11), 39 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass8 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-11.0, 39.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r \n", false, (int) (byte) 0, (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 27, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "\r", "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        int[] intArray4 = new int[] { (-4), (byte) 0, (short) 100, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-4, 0, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false, 38, (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (-431), (-95));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 51, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        long[] longArray3 = new long[] { 39, 601, 26 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[39, 601, 26]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", false, 83, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (int) (short) 100, 753);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) " \n\r \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\r\rh\ri\r!\r", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 31, 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", " \n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        int[] intArray6 = new int[] { (-4), '4', 'a', (short) 10, (byte) 100, 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-4, 52, 97, 10, 100, 97]");
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
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        double[] doubleArray5 = new double[] { 0L, (byte) 10, '4', 100.0d, 0.0d };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[0.0, 10.0, 52.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "\n", 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 45, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "hi!hi!hhi!ihi!!hi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r \n", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n\r \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 113, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 37, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!\nhi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        java.lang.String[] strArray2 = new java.lang.String[] { "\rh\ri\r!\r", "hi!\nhi!hi!\n" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\rh\ri\r!\r" + "'", str4, "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 474, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        char[] charArray8 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", true, (int) (byte) 0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (-27), (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (int) '\r', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n", 53, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", 20, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        double[] doubleArray6 = new double[] { (short) 1, 53, (-78), 48, (-91), (-1.0d) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 53.0, -78.0, 48.0, -91.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        char[] charArray8 = new char[] { 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", pattern1, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", pattern1, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\r\n", 34, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\r\n", "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", false, 0, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (int) (short) -1, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", 598, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rhi!", pattern1, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!\n", (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n", "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 79, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 2, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", 16, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\n\r\n", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\r\n", "\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n" + "'", str3, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true, 142, (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", 24, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\n\r\n\n\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 359, 456);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", true, 29, (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", 50, 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n", 31, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) " \n\r \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) " \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!???hi!?hi!hhi!ihi!!hi!???hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, " \n\r \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 359, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        long[] longArray6 = new long[] { (short) -1, '\n', 7, (byte) 100, 1L, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass21 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 7, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) " \n\r \n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r ", 92, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", true, (int) (short) 0, (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 598, 48);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, h, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, i, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, !, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, \n, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \n", 94, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (-451));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (-476), (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 18, (-452));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (-41));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!hi!?hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!?hi!hi!hhi!ihi!!hi!hi!?hi!hhi!ihi!!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", (-45), (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", false, 109, (java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (-78), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false, (-142), (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 78, 456);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n", pattern1, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n" + "'", str3, " \n\r\n");
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n", true, 219, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 7, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\r\n", pattern1, "\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\r\n" + "'", str3, "hi!\n\r\n");
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-451), 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true, (-508), (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 37, 126);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 474);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (-78));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", charSequence1, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\n\n\r\n\n\n\rhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        char[] charArray9 = new char[] { 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 50, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", pattern1, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", false, 30, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 126, 190);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n" + "'", str3, "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (-476), 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (-26));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!?hi!hhi!ihi!!hi!hhi!ihi!!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 476, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        long[] longArray3 = new long[] { 102, 72, 452 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[102, 72, 452]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", 431, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false, 0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", 6, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        int[] intArray3 = new int[] { 0, 11, 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 11, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 8, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", 33, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", "\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true, 35, (java.lang.CharSequence) " \n\r\n", 455, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) " \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", " \n\r \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        char[] charArray5 = new char[] { 'a', '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\rh\ri\r!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\r\n\r\n", (-475));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 169, 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\nhi!", "hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\nhi!hi!\n", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n" + "'", str3, "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", 83, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", 19, 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (int) (byte) 10, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 82, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        double[] doubleArray4 = new double[] { (-30), '#', ' ', (-1.0d) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-30.0, 35.0, 32.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        short[] shortArray3 = new short[] { (short) 0, (byte) -1, (byte) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0, -1, 100]");
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
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?h?i?!?hhi!ihi!!hi!hhi!ihi!!hi!?hi!hi!hi!hi!?hi!?hi!?hi!??hi!?hi!??hi!?hi!??hi!?hi! hi!?hi!hi!?hi!hi!?hi! hi!?hi!?hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r ", 135);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", false, 33, (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", 53, 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\n\r\n\n\n\rhi!\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\r\n", 455);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charSequence1, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        long[] longArray5 = new long[] { (-3), (short) 0, (byte) 1, (byte) -1, 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-3, 0, 1, -1, 0]");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hhi!ihi!!hi!\rhi!", "hi!\nhi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", " ", "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 39, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (-78), 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        double[] doubleArray1 = new double[] { 11 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[11.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (-78), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (-8), (-109));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass16 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", 38, 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-210));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        short[] shortArray2 = new short[] { (byte) 0, (short) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-78), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 82);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rhi!", " \n\r \n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", true, 100, (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 620, 219);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (short) 10, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) " \n\r \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhi!", "hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!");
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n", 94, (-598));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 615 + "'", int1 == 615);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        double[] doubleArray1 = new double[] { 1.0d };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        java.lang.String[] strArray2 = new java.lang.String[] { "\rh\ri\r!\r", "hi!\nhi!hi!\n" };
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\rh\ri\r!\r" + "'", str4, "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\rh\ri\r!\r" + "'", str7, "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray7);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", pattern1, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n" + "'", str3, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-109));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", true, (-9), (java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (-26), (-251));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-27), 78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, charSequence1, (-26));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", "\n\r\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) " \n\r \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 22, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        short[] shortArray5 = new short[] { (short) 0, (short) 1, (byte) 100, (short) 1, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, 1, 100, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 0, (-95));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (-431), 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (byte) 1, 190);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n", (-251));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray10);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (int) '\000', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 107, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\n", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \n", "hi!\nhi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 80, (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 50, 620);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

