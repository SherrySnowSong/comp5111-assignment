package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", true, 4, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", 40, 613);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????h?i?!???h?i?!?h?i?!?hi!hi!????hi!????hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\nhi!hi!\nhi!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 106);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!", "\n\r\n", "\n\r\nhi!", "\n\r\n", "\n\r\nhi!", "\nhi!" };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        char[] charArray7 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!", (-4), 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 328 + "'", int1 == 328);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 23, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\r\nhi!\r\nhi!hi!\nhi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\rhi!\n\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", true, 137, (java.lang.CharSequence) "\rhi!\n\rhi!", (-5), 307);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (-39), (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 270);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", 1, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!hi!hi!?hi!hi!hhi!?hi!hi!ihi!?hi!hi!!hi!?hi!hi!hi!?hi!hi!hi!?hi!hi!hhi!?hi!hi!ihi!?hi!hi!!hi!?hi!hi!hhi!?hi!hi!ihi!?hi!hi!!hi!?hi!hi!hi!hi!?hi!hi!hi!hi!?hi!hi!hi!hi!hi!hi!?hi!hi!hi!hi!?hi!hi!hi!hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!hi!hi!?hi!hi!hi!hi!hi!hi!hi!hi!?hi!hi!hi!hi!hi!?hi!hi!hi!hi!?hi!hi!hi!hi!hi!hi!??hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        long[] longArray1 = new long[] { 18 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[18]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        char[] charArray10 = new char[] {};
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
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
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
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
        java.lang.Class<?> wildcardClass16 = strArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 527);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 274 + "'", int1 == 274);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (-70));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i !   ", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   " + "'", str3, " \n h i !   ");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", 274, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!", "\r", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", (int) '#', 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 22, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 38, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i !   ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray9);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray9);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", false, (int) (short) 10, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", 95, 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 53, 480);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray6);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95) + "'", int3 == (-95));
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 224 + "'", int1 == 224);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\nhi!hi!", pattern1, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", pattern1, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (-257));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\rhi!\n\rhi!", pattern1, "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rhi!\n\rhi!" + "'", str3, "\r\rhi!\n\rhi!");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
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
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        char[] charArray2 = new char[] {};
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!hi!??hi!??hi!hi!h?hi!??hi!hi!i?hi!??hi!hi!!hi!??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 320, 274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 16, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        long[] longArray2 = new long[] { (byte) 0, '#' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, 35]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (short) 100, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100, 10]");
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
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!????hi!??hi!???hi!??hi!?hi!??hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hi!??hi!?hi!??hi!?hi!??hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!????hi!??hi!???hi!??hi!?hi!??hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hi!??hi!?hi!??hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!????hi!??hi!???hi!??hi!?hi!??hi!?????hi!??hi!???hi!??hi!?hi!??hi!??hi!??hi!?hi!??hi!?hi!??hi!?hi!??hi!?hi!??hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!hi!??hi!??hi!hi!?hi!hi!hi!??hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!hi!?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!??hi!??hi!hi!hi!?hi!hi!??hi!??hi!hi!hi!?hi!hi!hi!hi!hi!?hi! ? h i !   ?hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true, 480, (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (int) 'a', (-17));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\n" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        java.lang.Class<?> wildcardClass4 = charSequenceArray1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i !   ", "\nhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\rhi!\r\nhi!\r\nhi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", true, (-82), (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (-70), (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", 88, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-1), 110);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", " ", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray4);
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
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!", pattern1, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        java.lang.Class<?> wildcardClass9 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        float[] floatArray2 = new float[] { (-50), 10L };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-50.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        char[] charArray10 = new char[] {};
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", 748);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!", 107, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, 1, (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 42, 137);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 89, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!" + "'", str3, "\rhi!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", pattern1, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", (-307), 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (int) ' ', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??h?i?!???h?i?!?h?i?!?hi!?hi!?hi!hi!hi!?hi!?hi!hi!hi!??hi!hi!?hi!?hi!hi!hi!hi!hi!?hi!hi!?hi!?hi!hi!hi!?????h?i?!???h?i?!?h?i?!?hi!hi!????hi!????hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!", "", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\n" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 164, 94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!", 54, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!\nhi!", 274);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", false, (int) '\r', (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", 3, (-39));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (-267), (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-158), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true, (-95), (java.lang.CharSequence) "", (int) (short) 0, (-106));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "\n", "\n" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (-70));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 19, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) 1, (byte) 1, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\rhi!\n\rhi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
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
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 39, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 307);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!hi!\nhi!\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!" + "'", str3, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\rhi!\n\rhi!", "\n\r\nhi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rhi!\n\rhi!" + "'", str3, "\r\rhi!\n\rhi!");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 137, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 9, 748);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! ", 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 7, 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! ", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        int[] intArray4 = new int[] { (-22), (short) -1, 164, '\n' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-22, -1, 164, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\r\nhi!\r\nhi!hi!\nhi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        java.lang.Class<?> wildcardClass17 = charArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray6);
        java.lang.Class<?> wildcardClass15 = charArray6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 328, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 39, (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
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
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\n\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\nhi!hi!", "\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!", true, (-7), (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 14, 88);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 102, (-288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (int) (byte) 10, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\n", "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", 39);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charSequence1, (-288));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "hi!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (int) (short) -1, 748);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\rhi!\n\rhi!", 3, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 89, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-22), 527);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 107);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hi!", pattern1, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!" + "'", str3, "hi!\nhi!hi!");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\n\r\n", "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", true, (int) (short) -1, (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", 748, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", pattern1, "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false, 10, charSequence3, 110, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " ", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (-72), 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!" + "'", str3, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!" + "'", str3, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (int) (byte) 10, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "hi!\nhi!hi!", "\r\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "\nhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        boolean[] booleanArray3 = new boolean[] { true, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass11 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray7);
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
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\r\rhi!\n\rhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!", 20, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray6);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        java.lang.Class<?> wildcardClass16 = charArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!", false, 7, (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", (-50), (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!\r\nhi!hi!", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", false, 6, (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 94, 50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", true, (int) '\000', (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 38, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 17, (java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) (short) 0, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 11, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-95), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\nhi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!", pattern1, "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", true, (int) (byte) 0, (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (int) (byte) 1, (-92));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray5);
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
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        long[] longArray3 = new long[] { 6, 56, (short) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[6, 56, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\n\rhi!", false, 5, (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (int) (short) -1, (-14));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

