package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n" + "'", str3, " \n\r \n");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 7, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hhi!ihi!!hi!\rhi!", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\n\r\n\n\n\rhi!\n", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-78), 219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r ", pattern1, "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r ");
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 59);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (-27), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
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
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        char[] charArray6 = new char[] {};
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", true, 2, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 99, 133);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 101, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "\rh\ri\r!\r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 351 + "'", int3 == 351);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r ", (-452), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n" + "'", str3, " \n\r \n");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "hi!hhi!ihi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (-170));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!hi!??hi!??hi!?hi!??hi!?hi!?hi!hhi!ihi!!hi!hi!??hi!??hi!?hi!??hi!?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (-91), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (-1), 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (-3), 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\r\n", false, 15, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 452, 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-41));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "\n\r\n", (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "hi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        boolean[] booleanArray4 = new boolean[] { false, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, false, true]");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
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
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 170 + "'", int3 == 170);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", 61, (-210));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r \n", false, 94, (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-476), 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 7, (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", pattern1, "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", true, 22, (java.lang.CharSequence) "hi!", 133, 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false, 91, (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 72, 142);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", pattern1, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 133);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", 797);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", false, 51, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-45), (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n", 102, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", true, (-4), (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", 1, 51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (-61));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (-210));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", pattern1, "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 110 + "'", int1 == 110);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false, 92, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 113, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", " \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", false, 256, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 0, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 474, 79);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        java.lang.CharSequence charSequence8 = null;
        char[] charArray11 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence8, charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-30), 44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        int[] intArray5 = new int[] { 41, (-30), 5, 753, 100 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[41, -30, 5, 753, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!\rhi! hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        java.lang.Class<?> wildcardClass13 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 10, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass9 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n,  , \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        short[] shortArray2 = new short[] { (byte) 0, (short) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass11 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str19 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", pattern1, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charSequence1, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\r\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        float[] floatArray3 = new float[] { 27, '#', 11 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass6 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[27.0, 35.0, 11.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 351, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 190);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) '#', 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, \r, i, \r, !, \r, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", 44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", "\rh\ri\r!\r", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n", (java.lang.CharSequence) "\rh\ri\r!\r", 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", 44, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 38 + "'", int3 == 38);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", 26, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-7), (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\r\n", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", false, 0, (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", 2, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\n\n\r\n\n\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        char[] charArray8 = new char[] { ' ', '4', '\000', '#', ' ', '\000' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " 4\000# \000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " 4\000# \000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , 4, \000, #,  , \000]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-4), 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!\nhi!hi!\n", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\rh\ri\r!\r ", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (-475), 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray9);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", false, 2, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 598, (-8));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 79, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n", false, (-91), (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 48, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", 80, 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", 102, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray8);
        java.lang.Class<?> wildcardClass16 = charArray8.getClass();
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?h?i?!???h?i?!?h?i?!???hi!?hi!hi!??hi!??hi!?hi!??hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
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
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        short[] shortArray2 = new short[] { (byte) 0, (short) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass12 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 553 + "'", int3 == 553);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", 34, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        float[] floatArray3 = new float[] { 125, 99, 36 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass5 = floatArray3.getClass();
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[125.0, 99.0, 36.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\nhi!hi!\n", (-431));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) " \n\r \n", (-750));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (java.lang.CharSequence) "hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        short[] shortArray6 = new short[] { (byte) 1, (short) 1, (short) 10, (short) -1, (short) 0, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 10, -1, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        double[] doubleArray4 = new double[] { (-1.0f), ' ', (-1L), 1.0f };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 32.0, -1.0, 1.0]");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        long[] longArray4 = new long[] { (-45), (short) 100, 48, 135 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-45, 100, 48, 135]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (-19), 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        char[] charArray9 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        java.lang.Class<?> wildcardClass16 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\rhi!", "\n\n\n\r\n\n\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        byte[] byteArray1 = new byte[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 126);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 31, (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 133 + "'", int1 == 133);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", false, 82, (java.lang.CharSequence) "\rh\ri\r!\r ", 443, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        long[] longArray3 = new long[] { 102, 72, 452 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass6 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[102, 72, 452]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray9);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n", charArray9);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        byte[] byteArray1 = new byte[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 0, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", 16, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", " \n\r \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rhi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "\rh\ri\r!\r", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r ", pattern1, "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r ");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!\nhi!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass16 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 24, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        java.lang.Class<?> wildcardClass19 = charArray8.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", pattern1, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n", (-11), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\n" + "'", str3, "hi!\nhi!hi!\n");
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        boolean[] booleanArray4 = new boolean[] { false, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", true, 0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-41), 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n", false, 223, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-451), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", pattern1, " \n\r \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r\n", "hi!hhi!ihi!!hi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        char[] charArray5 = new char[] { 'a', '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", 16, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass6 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!\n\r\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (-452));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true, (-61), (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", 223, 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        char[] charArray7 = new char[] { 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\r\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (-8), 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", 431, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        char[] charArray12 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (java.lang.CharSequence) "hi!\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-27));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, (int) (byte) 1, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 443, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", 431, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (-142));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r", false, 61, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (int) '\r', 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", 456);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-612) + "'", int3 == (-612));
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 133, (-78));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true, 456, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 753, 109);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", false, (-91), (java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (-18), 753);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (-210));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (int) (byte) 1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\r\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        short[] shortArray2 = new short[] { (byte) 10, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass8 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 256);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        char[] charArray8 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!\n", true, 0, (java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 20, (-476));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", true, 251, (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 13, 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 18 + "'", int8 == 18);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", 45, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (-475));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
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
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
        int[] intArray5 = new int[] { 'a', 5, 19, 94, 6 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 5, 19, 94, 6]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }
}

