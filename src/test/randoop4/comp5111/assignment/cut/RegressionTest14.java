package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hi!hhi!ihi!!hi!\rhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", true, 190, (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-22), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", pattern1, "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        char[] charArray4 = new char[] { 'a', '\000' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        short[] shortArray2 = new short[] { (byte) 0, (short) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        long[] longArray5 = new long[] { (-3), (short) 0, (byte) 1, (byte) -1, 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-3, 0, 1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
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
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (int) (byte) 1, 601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
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
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", pattern1, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "hi!\nhi!hi!\n", (-41));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", true, (-41), (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 33, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", true, (-30), (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", 251, 598);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
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
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 92, 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\r\n", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\n\n\r\n\n\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", 443, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", true, 48, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-251), 50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        java.lang.CharSequence charSequence7 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hhi!ihi!!hi!\rhi!", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray7);
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
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", 102, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        float[] floatArray3 = new float[] { 27, '#', 11 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[27.0, 35.0, 11.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", pattern1, "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hhi!??hi!?hi!??hi!?ihi!??hi!?hi!??hi!?!hi!??hi!?hi!??hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n", (-210), 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        int[] intArray4 = new int[] { 6, 0, 31, '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[6, 0, 31, 35]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 135, 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n", true, 107, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (-94), 133);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-31) + "'", int3 == (-31));
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        short[] shortArray3 = new short[] { (short) 1, (byte) -1, (short) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, -1, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charArray4);
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
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", pattern1, "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-451));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", 101, 588);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", 443);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray6);
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
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        long[] longArray4 = new long[] { (byte) 0, 4, (-1L), (short) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 4, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", 169);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", true, 79, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-598), 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\n\r\n\n\n", "\rh\ri\r!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-170));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", pattern1, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass4 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        int[] intArray3 = new int[] { 0, 11, 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 11, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-219) + "'", int3 == (-219));
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!\n\n\n\r\n\n\n\rhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 553 + "'", int1 == 553);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\r\n", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) " \n\r\n", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
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
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean18);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", charArray5);
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
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, i, !, \n, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", pattern1, "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
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
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 615, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", true, 142, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 0, 26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 431, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true, 133, (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", 598, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        int[] intArray6 = new int[] { (-4), '4', 'a', (short) 10, (byte) 100, 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass12 = intArray6.getClass();
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-4, 52, 97, 10, 100, 97]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", 456);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 230 + "'", int1 == 230);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
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
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 83, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        char[] charArray0 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!\n", false, (-91), (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 4, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\n", 35, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 8, 351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        float[] floatArray4 = new float[] { '\r', 4, 100, 0L };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[13.0, 4.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
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
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray9);
        java.lang.Class<?> wildcardClass20 = charArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-61));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!hhi!ihi!!hi!\rhi!", "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        char[] charArray10 = new char[] { 'a', '\000' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\n", charArray10);
        java.lang.Class<?> wildcardClass20 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\r\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
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
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", 598, 588);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", 36, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r ", 223);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 474, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 10, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", pattern1, "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-45));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !]");
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", false, 0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (-94), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", (int) (byte) 0, 598);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (int) '\n', (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\n", (java.lang.CharSequence) "\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 797, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        short[] shortArray2 = new short[] { (byte) 10, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 0]");
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
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", 431);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", pattern1, "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\n\n\n\r\n\n\n", 601);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (java.lang.CharSequence) "\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", false, 83, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (-61), 256);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        double[] doubleArray5 = new double[] { 15, (-7), 41, 22, (-1.0f) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[15.0, -7.0, 41.0, 22.0, -1.0]");
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
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (int) ' ', 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n" + "'", str3, "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", true, 351, (java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", 35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", true, (-750), (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (-219), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r \n", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n" + "'", str3, " \n\r \n");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
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
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 102, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", true, (-27), (java.lang.CharSequence) "\rh\ri\r!\r", 9, 170);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
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
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.Class<?> wildcardClass17 = strArray5.getClass();
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
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
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false, 113, charSequence3, 99, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", pattern1, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ", charSequence1, 588);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !,  , h, i, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
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
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray9);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", true, (int) '4', (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-61), 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\r\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 169, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!\rhi! hi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!\rhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!\rhi! hi!\nhi!");
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass8 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "\rh\ri\r!\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
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
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray10);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", 251);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        boolean[] booleanArray6 = new boolean[] { false, false, false, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass10 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
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
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass20 = strArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 33, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!?hi!hhi!ihi!!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 133, (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass3 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r\n", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        float[] floatArray1 = new float[] { '#' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[35.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 3, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", 79, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-4), (-219));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        int[] intArray3 = new int[] { '4', '\r', (-3) };
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[52, 13, -3]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 431 + "'", int3 == 431);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
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
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass19 = strArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n", 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 454 + "'", int3 == 454);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        float[] floatArray2 = new float[] { (-11), 39 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-11.0, 39.0]");
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
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", 588, 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "\rh\ri\r!\r", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 613 + "'", int1 == 613);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rhi!", "hi!\nhi!hi!\n", "hi!hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        float[] floatArray1 = new float[] { 100L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\n\r\n\n\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n");
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\r\n\r\n", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!\n\r\rh\ri\r!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", "hi!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", 598, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \r\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r i\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r !\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r \n\rh\ri\r!\r h\rh\ri\r!\r i\rh\ri\r!\r !\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 682 + "'", int1 == 682);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", pattern1, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        char[] charArray10 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        float[] floatArray3 = new float[] { 30, (-91), (-78) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[30.0, -91.0, -78.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (int) (short) 100, 620);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
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
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        char[] charArray4 = new char[] {};
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 170 + "'", int1 == 170);
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\rhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi!hi!\nhi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!");
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!\rhi!hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!hi!", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        short[] shortArray5 = new short[] { (byte) 100, (short) 100, (byte) -1, (short) 100, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[100, 100, -1, 100, 10]");
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
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 613);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", (int) '\000', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, i, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, \r, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !,  , h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        long[] longArray1 = new long[] { 476 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[476]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\rhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!\nhi!hhi!ihi!!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        long[] longArray5 = new long[] { 80, 10, 3, 9, 23 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[80, 10, 3, 9, 23]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", pattern1, "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n" + "'", str3, "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r\n", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
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
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        double[] doubleArray4 = new double[] { (-1.0f), ' ', (-1L), 1.0f };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "\n\n\n\r\n\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", (java.lang.CharSequence) "\rh\ri\r!\r", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 431, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 443);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", pattern1, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "hi!\n\r\n", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        boolean[] booleanArray4 = new boolean[] { false, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!hhi!hhi!ihi!!hi!ihi!hhi!ihi!!hi!!hi!hhi!ihi!!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!");
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", pattern1, " \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 259 + "'", int1 == 259);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!\n\rhi!\n\rhi!\n\n", charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 256, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", " \n\r \n", "\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "\rh\ri\r!\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!hi!\n\r\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\r \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\n \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n", pattern1, "hi!\n\n\r\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", " \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
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
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\n\r\nhi!\rhi!hhi!ihi!!hi!\n\r\nhi!", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\n\r\n\r\ni\n\r\n\r\n\r\n!\n\r\n\r\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\r\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\nh\n\r\n\n\n\r\ni\n\r\n\n\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
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
        java.lang.String str19 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hi!hhi!ihi!!hi!hi!hi!\nhi!hi!\nhi!hhi!ihi!!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

