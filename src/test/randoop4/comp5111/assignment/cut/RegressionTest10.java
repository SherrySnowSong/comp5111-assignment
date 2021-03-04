package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !,  , h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \r, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !,  , h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 251 + "'", int3 == 251);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 455, (-476));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", pattern1, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!\nhi!\rhi! hi!\nhi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r\n", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 135 + "'", int3 == 135);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\r", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", 620, 601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
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
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (-11), (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\r\n", pattern1, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\r\n" + "'", str3, "hi!\n\r\n");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 11, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", true, (-109), (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 431, 18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r ", 0, 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true, 2, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (int) (byte) 0, 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n", "", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n" + "'", str3, " \n\r \n");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rhi!", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-78), (-95));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        int[] intArray3 = new int[] { '4', '\r', (-3) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 13, -3]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false, 99, (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 251, 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (int) '#', 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 219, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (-8), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) " \n\r \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, 135, (java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", (-9), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "\rh\ri\r!\r", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\r\n", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", "hi!\n\n\n\r\n\n\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hhi!ihi!!hi!\rhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        int[] intArray6 = new int[] { (-4), '4', 'a', (short) 10, (byte) 100, 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-4, 52, 97, 10, 100, 97]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r \n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n" + "'", str3, " \n\r\n");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 10, (short) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 10, 0]");
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
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) " \n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 598, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", false, 38, (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 142, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!\nhi!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 452, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", pattern1, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r \n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\r\n", (int) ' ', 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n", pattern1, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n" + "'", str3, " \n\r\n");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        char[] charArray9 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 44, 443);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-508) + "'", int3 == (-508));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
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
        java.lang.Class<?> wildcardClass18 = longArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", 588, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        char[] charArray9 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 476);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", true, 80, (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", (-3), 588);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", (-210), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 34, 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (-431), 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\r\n", true, 50, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 36, (-210));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "hi!\n\r\n", " \n\r \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n" + "'", str3, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) " ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
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
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 7, (-94));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (-27), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", 45, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        comp5111.assignment.cut.ToolBox.CharSequenceTools charSequenceTools0 = new comp5111.assignment.cut.ToolBox.CharSequenceTools();
        java.lang.Class<?> wildcardClass1 = charSequenceTools0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceTools0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 30, 797);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r \n", false, 27, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 50, 53);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "hi!\n\rhi!\n", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        char[] charArray9 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", 0, (-170));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r", " \n\r \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n" + "'", str3, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", false, 601, (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 12, 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r \n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r", true, 48, (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", 1, 456);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?h?i?!???h?i?!?h?i?!???h?h?i?!???h?i?!?h?i?!???i?h?i?!???h?i?!?h?i?!???!?h?i?!???h?i?!?h?i?!???hhi!ihi!!hi!?hi!hi!??hi!??hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
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
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
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
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi! hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi! hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!??hi!hi!??hi!??hi!?hi!??hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\n\r\n\n\n\rhi!\n", " ", "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        boolean[] booleanArray6 = new boolean[] { true, false, false, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", "\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        char[] charArray8 = new char[] { 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n", "\rh\ri\r!\r ", "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray5);
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
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n", false, (-598), charSequence3, (-452), 53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rhi!", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hhi!ihi!!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r ", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", pattern1, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n" + "'", str3, "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (-94), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-142) + "'", int3 == (-142));
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", pattern1, "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!hhi!ihi!!hi!\rhi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", 44, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", true, 29, (java.lang.CharSequence) " ", 16, 82);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hi!\n\r\rh\ri\r!\r", "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        char[] charArray7 = new char[] { 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n", pattern1, "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", true, 5, (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 20, 474);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-750) + "'", int3 == (-750));
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 126 + "'", int1 == 126);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (byte) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", (-9));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 23, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\r\n", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\r\n" + "'", str3, "hi!\n\r\n");
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r ", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\n", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\n" + "'", str3, "hi!\nhi!hi!\n");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
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
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 102, 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !,  , h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \r, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !,  , h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "\rh\ri\r!\r ", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (-78));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass12 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        char[] charArray6 = new char[] { 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\n" + "'", str3, "hi!\nhi!hi!\n");
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        long[] longArray4 = new long[] { (byte) 0, 4, (-1L), (short) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 4, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n", "hi!\n\rhi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n" + "'", str3, " \n\r\n");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!\rhi! hi!\nhi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", true, 5, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (-78), (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi!\nhi!hi!\n", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", true, 9, (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (-27), 588);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhi!hi!\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \r,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \n,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n]");
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", true, 753, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 38, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false, 16, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", 126, (-170));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (-750));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) ' ', 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 0, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 10, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 29, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 431, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "hi!\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        float[] floatArray1 = new float[] { '#' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass12 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[35.0]");
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\n\r\n", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "hi!hi!\n\r\rh\ri\r!\r", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (int) '\000', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        double[] doubleArray1 = new double[] { 455 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[455.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r\n", (java.lang.CharSequence) "hi!\n\r\n", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) (short) 10, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", true, 9, (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (-26), 601);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray7);
        java.lang.Class<?> wildcardClass19 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 23, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", 18, 142);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", false, 0, charSequence3, 0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) " \n\r \n", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????h?i?!???h?i?!?h?i?!???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n", pattern1, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        long[] longArray6 = new long[] { (short) -1, '\n', 7, (byte) 100, 1L, 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass12 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 7, 100, 1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 359 + "'", int1 == 359);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n", 22, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!\n\r\rh\ri\r!\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\n" + "'", str3, "hi!\nhi!hi!\n");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 51, (-142));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (-210), 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        int[] intArray3 = new int[] { 0, 11, 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 11, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\r\n", false, (-19), (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-72), 36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\r\n", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
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
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r \n", (-18));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rhi!", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-45));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 94, (-91));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \r, h, \r, i, \r, !, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, i, !]");
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!\rhi! hi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n", 431);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", (int) (short) 0, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 455);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (-78));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r \n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n", 431, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

