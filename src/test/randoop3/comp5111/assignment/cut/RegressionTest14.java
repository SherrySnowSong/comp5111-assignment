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
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
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
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray8);
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
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", 28, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-70));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\n\rhi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 137, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", (-328));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\n\r\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (int) '\n', charSequence3, 0, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   ", 224, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", (-158));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false, 18, (java.lang.CharSequence) "\n\r\nhi!", 299, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true, 70, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", 11, (-80));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
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
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass15 = strArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 309);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        double[] doubleArray1 = new double[] { (short) 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", false, 5, (java.lang.CharSequence) "\nhi!\r\nhi!hi!", 128, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 527);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\nhi!", "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   " + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 156, (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 56, 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
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
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 212 + "'", int3 == 212);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 12, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        long[] longArray2 = new long[] { (short) -1, 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass13 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
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
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", true, (int) (short) 10, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 94, 36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray9);
        java.lang.Class<?> wildcardClass20 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 8, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95) + "'", int3 == (-95));
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        float[] floatArray3 = new float[] { 4, 3, 91 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[4.0, 3.0, 91.0]");
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
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 16, 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence4, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-48), 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", charSequence1, (-21));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-92), (-80));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", true, (int) (short) 100, (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (-4), 70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
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
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", true, 320, (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 137, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-290), 613);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
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
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", pattern1, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-120) + "'", int3 == (-120));
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", (-72), 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", 748);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (-80), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\rhi!\n\rhi!", (-70));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", 212);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-224), (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 41, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-80), (-156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", charSequence1, 274);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "hi!\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!hi!\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!hi!\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!");
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", (java.lang.CharSequence) " \n h i !   ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) " \n h i !   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
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
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 344);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", false, 107, charSequence3, (-92), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false, 40, (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 34, 14);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (-156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", 102, 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-492) + "'", int3 == (-492));
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!" + "'", str3, "\rhi!");
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (-106), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\n\rhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\rhi!\n\rhi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\r\nhi!\r\nhi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", false, (-39), (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", 28, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 36, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
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
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi! ", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass9 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", charArray8);
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
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!hi!\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 527 + "'", int1 == 527);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charSequence1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charSequence1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", false, (-492), (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", 291, 527);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125 + "'", int1 == 125);
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true, 28, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (short) 100, 308);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", false, 0, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", 31, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        double[] doubleArray2 = new double[] { (short) 1, '#' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\rhi!\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", pattern1, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray8);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        char[] charArray12 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray12);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray12);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", charArray12);
        java.lang.Class<?> wildcardClass25 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", false, (-82), (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass13 = charSequenceArray5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 206 + "'", int2 == 206);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\rhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , h, i, !, \r,  , h, i, !, h, i, !, h, i, !, \r,  , h, i, !, \r,  , h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", 224, 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-17), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 5, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", pattern1, "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "\n", "\n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true, 100, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!hi!\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!", (-94), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n", "hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, 33, (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 35, 274);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (-125), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        int[] intArray5 = new int[] { 10, 3, 4, (short) 100, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 3, 4, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (-290), 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 0, (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", pattern1, "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!" + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true, (int) (byte) -1, charSequence3, (-158), 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!hi!\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!\n\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!hi!", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true, (int) 'a', (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (-328), 56);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", false, (-3), (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 70, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!", 43, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        char[] charArray13 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 83 + "'", int1 == 83);
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 39, 613);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (int) (short) 10, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        float[] floatArray1 = new float[] { 21 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[21.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        short[] shortArray3 = new short[] { (byte) 10, (byte) 1, (short) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 527);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 244 + "'", int1 == 244);
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", 94, (-150));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true, 313, (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (-14), 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", 15, 224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true, 32, (java.lang.CharSequence) "\r", 128, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) " \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", (-125));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", " ", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 90, charSequence3, 119, (-82));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (-299), 291);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!???hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!???hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!??hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 36, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!", pattern1, "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i !   ", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   " + "'", str3, " \n h i !   ");
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 313, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true, 299, (java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 0, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!" + "'", str3, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        double[] doubleArray5 = new double[] { '4', 100, '#', (short) 10, '\r' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 100.0, 35.0, 10.0, 13.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (-4), (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", 23, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        double[] doubleArray5 = new double[] { '4', 100, '#', (short) 10, '\r' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[52.0, 100.0, 35.0, 10.0, 13.0]");
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
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 46, 76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "hi!\nhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        byte[] byteArray3 = new byte[] { (byte) 0, (byte) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[0, 100, 10]");
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
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", 307);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", "\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, (int) (byte) -1, (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 5, 119);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", pattern1, "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
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
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass19 = strArray4.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!" + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "\n\r\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", pattern1, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "hi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (-68));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!" + "'", str3, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", false, 0, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 54, 76);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        char[] charArray13 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }
}

