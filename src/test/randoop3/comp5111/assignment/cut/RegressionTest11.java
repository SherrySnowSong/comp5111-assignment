package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\nhi!", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-61), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        java.lang.Class<?> wildcardClass15 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-299), 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        char[] charArray11 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 92);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\n", "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! ", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !,  , \r, h, i, !, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !,  , \r, h, i, !, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \r, \r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !]");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "", 64);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\rhi!\n\rhi!", (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\n\r\n", "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", pattern1, "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass17 = strArray4.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass9 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 198);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
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
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (-4), 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", pattern1, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi! \n h i !   \nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !,  , \n,  , h,  , i,  , !,  ,  ,  , \n, h, i, !, h, i, !]");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true, 7, (java.lang.CharSequence) "\rhi!", 19, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 137, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", (int) '\000', 20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", (-82), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        short[] shortArray2 = new short[] { (byte) -1, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 10]");
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
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (-158), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", false, (-267), (java.lang.CharSequence) " ", 9, (-7));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", false, (-19), (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 15, 309);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (-21), 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "hi!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!" + "'", str3, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 307 + "'", int1 == 307);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        float[] floatArray3 = new float[] { 10L, 0.0f, 0L };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass12 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 107, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        int[] intArray6 = new int[] { 306, (short) 1, 6, 613, (-7), (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[306, 1, 6, 613, -7, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (-50));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (-21), 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", false, 8, (java.lang.CharSequence) "\n\r\n", (-307), 42);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 39, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \r, \n, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, h, i, !, \n, \r]");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !]");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!??hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 88, 306);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???h?i?!???h?i?!?h?i?!???hi!hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!???hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", 88, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (-82));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 320);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", pattern1, "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false, 102, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 12, 42);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 83 + "'", int3 == 83);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        short[] shortArray2 = new short[] { (byte) 0, (byte) -1 };
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
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, -1]");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!", pattern1, "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true, (-91), (java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (-156), 74);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 74, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 11, 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 6, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) 1, (byte) 1, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray5);
        java.lang.Class<?> wildcardClass8 = shortArray5.getClass();
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass13 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi! ", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!", "\r\rhi!\n\rhi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119 + "'", int2 == 119);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\rhi!\n\rhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!", pattern1, "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", pattern1, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi! \n h i !   \nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (-5), 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", true, (int) ' ', (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (byte) 1, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (-92), 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        java.lang.Class<?> wildcardClass20 = charArray8.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi!\nhi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!hi!", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!" + "'", str3, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 0, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "hi!", (-70));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   ", pattern1, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   " + "'", str3, " \n h i !   ");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", 36, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        float[] floatArray3 = new float[] { 14, (-48), 8 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[14.0, -48.0, 8.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", (-257), 613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 223, 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", true, 291, (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", 46, (-307));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 217 + "'", int3 == 217);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!", true, 89, (java.lang.CharSequence) "\nhi! ", 0, 299);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        java.lang.Class<?> wildcardClass18 = charArray8.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!\n\rhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "\r", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 16, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray7);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i !   ", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   " + "'", str3, " \n h i !   ");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 106);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
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
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!", 56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\r\nhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 328, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", 198);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", pattern1, "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 309);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!" + "'", str3, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 198 + "'", int3 == 198);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (-95), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", 217, 613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 291, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 8, 316);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!hi!?hi!?hi!hi!hi!hi!?hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 274, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", true, 61, (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (-124), (-156));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 89 + "'", int3 == 89);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!hi!\nhi!", " \n h i !   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", false, 35, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-267), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i !   ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\rhi!\n\rhi!", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", pattern1, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!?h?i?!?hi!?hi!?hi!hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 53, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (-50));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray7);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\n\rhi!", true, 320, (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (int) '\r', (-307));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 613);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!?hi! ??hi! hi!hi!??hi! ??hi! hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!?hi! ??hi! hi!hi!??hi! ??hi! hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!??h?i?!???h?i?!?h?i?!??hi!hi!?hi!?hi!hi!hi!?hi! ??hi! hi!hi!??hi! ??hi! hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (short) 100, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        double[] doubleArray1 = new double[] { (-19) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-19.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", true, 10, (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 18, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 217);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", 224, (-158));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-156), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", (-94), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", 35, 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-68) + "'", int3 == (-68));
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", 306, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!??hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!hi! ? h i !   ?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray8);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        long[] longArray3 = new long[] { 6, 56, (short) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass5 = longArray3.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[6, 56, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 316);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        short[] shortArray2 = new short[] { (byte) 0, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass5 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\r\rhi!\n\rhi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!", "\n\r\nhi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        double[] doubleArray2 = new double[] { ' ', 39 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[32.0, 39.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\n" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) (byte) 1, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "\n", "\n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 267);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", pattern1, "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", 19, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n,  , h,  , i,  , !,  ,  ,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , \r,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , \r,  , \n,  , h,  , i,  , !,  ,  ,  , \n,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  , h,  , \n,  , h,  , i,  , !,  ,  ,  , i,  , \n,  , h,  , i,  , !,  ,  ,  , !,  , \n,  , h,  , i,  , !,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 308 + "'", int3 == 308);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", 90, (-307));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", 309, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 0, 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!" + "'", str3, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\rhi!\n\rhi!", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", 56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!", 527);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

