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
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\n", (-82));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 10, (java.lang.CharSequence) "\n", (-82), 92);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????hi!??hi!hi!?hi!hi!???hi!??hi!hi!????hi!??hi!hi!?hi!hi!hi!hi!hi!????hi!??hi!hi!?hi!hi!???hi!??hi!hi!????hi!??hi!hi!?hi!hi!hi!hi!????hi!??hi!hi!?hi!hi!???hi!??hi!hi!????hi!??hi!hi!?hi!hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", 480);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", 50, (-267));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (-14));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 527, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\r\nhi!\r\nhi!hi!\nhi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
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
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray12);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray12);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!", "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-80) + "'", int3 == (-80));
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 72, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", 0, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray4);
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
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 270, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", true, 291, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 72, (-80));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (short) 100, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray4);
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
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        char[] charArray7 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!?hi!hi!????hi!hi!hi!hi!??hi!?hi!?hi!hi!????hi!hi!hi!hi!hi!hi!?hi!?hi!?hi!hi!????hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", pattern1, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95) + "'", int3 == (-95));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", true, (-328), (java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (-7), 198);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        char[] charArray13 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray13);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (-257), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", 164, (-257));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        float[] floatArray4 = new float[] { '#', (-12), 34, 11 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[35.0, -12.0, 34.0, 11.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", (-14), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 411 + "'", int1 == 411);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 344);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
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
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", true, 7, (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 85, 40);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
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
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi! \n h i !   \nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (-328));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        int[] intArray4 = new int[] { (-22), (short) -1, 164, '\n' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-22, -1, 164, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, \n, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", false, (-299), (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", 41, 46);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", true, (int) (short) 0, (java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", 31, 74);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\n\rhi!", true, (-17), (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (int) ' ', (-70));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i !   ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 12 + "'", int6 == 12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass14 = charArray5.getClass();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", 150, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", " \n h i !   ", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 308, (java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 150, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!??hi!??hi!h??hi!??hi!i??hi!??hi!!??hi!??hi!??hi!??hi!??hi!??hi!h??hi!??hi!i??hi!??hi!!??hi!??hi!h??hi!??hi!i??hi!??hi!!??hi!??hi!hi!??hi!??hi!hi!??hi!??hi!hi!hi!hi!??hi!??hi!hi!??hi!??hi!hi!hi!hi!???hi!??hi!hi!hi!??hi!??hi!hi!??hi!??hi!hi!hi!hi!hi!hi!??hi!??hi!hi!hi!??hi!??hi!hi!??hi!??hi!hi!hi!hi!hi!??hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", (-80), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!", 328);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\n" + "'", str6, "\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 128, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 51, 316);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", 308, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-39));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charSequence1, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!" + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", 89, (-92));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i !   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, h, i, !,  , \n,  , h,  , i,  , !,  ,  ,  , \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", 291);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        long[] longArray6 = new long[] { 270, 40, 92, 100, 307, 307 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[270, 40, 92, 100, 307, 307]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (-95), 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!\r\nhi!\r\nhi!hi!\nhi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!\nhi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!\nhi!");
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \r, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        long[] longArray1 = new long[] { 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", "\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 3, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (int) (byte) -1, (-328));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 110 + "'", int17 == 110);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", true, 33, (java.lang.CharSequence) "\r\rhi!\n\rhi!", 107, 223);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!", (-92));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", false, (-68), (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", 36, 39);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, \r, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, \r, h, i, !, \n, h, i, !, h, h, i, !, \n, h, i, !, i, h, i, !, \n, h, i, !, !, h, i, !, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", charArray7);
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
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (-92), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-224) + "'", int3 == (-224));
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 700 + "'", int1 == 700);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 22, 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", (java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\nhi!hi!", "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", pattern1, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rhi!\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, i, !, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, \r, \n, \r, \n, h, i, !, \r, \n, \r, \n, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        char[] charArray2 = new char[] {};
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!\n\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!h\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!i\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi! ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!", "\rhi!\n\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        float[] floatArray6 = new float[] { (byte) 1, 94, 1.0f, '\000', (short) 0, 1.0f };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        java.lang.Class<?> wildcardClass14 = floatArray6.getClass();
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 94.0, 1.0, 0.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, " \n h i !   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-9));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true, 224, (java.lang.CharSequence) "hi!\nhi!", 42, 89);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 88);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\r\rhi!\n\rhi!", "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "\nhi! \n h i !   \nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-61), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\n", (-156));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", false, 291, (java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", (-224), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) '\n', 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 320 + "'", int3 == 320);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!", pattern1, "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!??hi!??hi!hi!?hi!hi! ?hi!?hi!??hi!??hi!hi!?hi!hi! hi!hi!?hi!?hi!??hi!??hi!hi!?hi!hi! ?hi!?hi!??hi!??hi!hi!?hi!hi! hi!hi!hi!?hi!??hi!??hi!hi!?hi!??hi!??hi!??hi!hi!?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", pattern1, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", pattern1, "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", pattern1, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\r\nhi!\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!h\nhi!\nhi!\r\nhi!hi!hi!\nhi!i\nhi!\nhi!\r\nhi!hi!hi!\nhi!!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\nhi!\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 16, 274);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", pattern1, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (-288), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 40, 291);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", 5, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 177 + "'", int1 == 177);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!", 42, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 87);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! ", "\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
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
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!", (int) '#', 150);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, h, i, !, \r, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, h, i, !, h, i, !, h, i, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", 56);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", (int) 'a', (-150));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! ", pattern1, "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", false, (-39), (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 270, 198);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\n\nhi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-307), 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!", 217);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi!\r\nhi!hi!", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!" + "'", str3, "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-82), 46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\r\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i !   ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", (int) '\r', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\r\nhi!\r\nhi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\r\nhi!\r\nhi!hi!" + "'", str3, "\rhi!\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-290) + "'", int3 == (-290));
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!" + "'", str3, "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 198, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 316, (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 36, (-156));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
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
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", charSequence1, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-17));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r\rhi!\n\rhi!", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
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
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n\r\n", "\nhi!", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i !   ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray8);
        java.lang.Class<?> wildcardClass18 = charArray8.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        long[] longArray5 = new long[] { '\000', (short) 100, 'a', (-1L), '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[0, 100, 97, -1, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\r\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!", 100, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", pattern1, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!", (-156));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! ", pattern1, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 76, 411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", pattern1, "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125 + "'", int1 == 125);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i !   ", pattern1, "\nhi! \nhi! h\nhi! i\nhi! !\nhi! \nhi! \nhi! h\nhi! i\nhi! !\nhi! h\nhi! i\nhi! !\nhi! hi!\r\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!hi!hi!\nhi! hi!hi!\nhi! hi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   " + "'", str3, " \n h i !   ");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", (-80), 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", (java.lang.CharSequence) "\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!\r\rhi!\n\rhi!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!h\r\rhi!\n\rhi!i\r\rhi!\n\rhi!!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!\r\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!hi!\r\rhi!\n\rhi!hi!hi!\r\rhi!\n\rhi!hi!\r\rhi!\n\rhi!hi!hi!hi!hi!\r\nhi!hi!", 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false, 35, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\r\nhi!hi!", 18, 177);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", 110);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!", (-124));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!??hi!??hi!hi!?hi!??hi!??hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\r\nhi!\r\nhi!hi!\nhi!", true, 309, (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", 102, (-307));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\n\n\r\n\rhi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 53 + "'", int12 == 53);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 104 + "'", int1 == 104);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        char[] charArray10 = new char[] {};
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray10);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray10);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray10);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", charArray4);
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
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", pattern1, "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!" + "'", str3, "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!");
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\nhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\nhi!\r\nhi!hi!", charArray6);
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
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", charArray6);
        java.lang.Class<?> wildcardClass14 = charArray6.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!", pattern1, "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!" + "'", str3, " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n h i !   \nhi!hi!");
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray9);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false, 748, (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", 89, (-82));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", "\nhi! \n h i !   \nhi!hi!", "\n\r\n\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!" + "'", str3, "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\n\r\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r");
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray6);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        char[] charArray9 = new char[] {};
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray9);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rhi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        char[] charArray10 = new char[] {};
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rhi!", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\n\r\nh\ni\n!\n\n\nh\ni\n!\nh\nh\ni\n!\n\n\nh\ni\n!\ni\nh\ni\n!\n\n\nh\ni\n!\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nh\ni\n!\nh\ni\n!\n", charArray10);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!\n\r\n", charArray10);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!", "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, \r, \n, \r, \n, \n, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n, h, \n, \r, \n, i, \n, \r, \n, !, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hhi!hi!\nhi!\nhi!hi!hi!ihi!hi!\nhi!\nhi!hi!hi!!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\rhi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! \n h i !   \nhi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", (-3), (-267));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) " \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   \r \n h i !   \n \n h i !   \r \n h i !   \n \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   h \n h i !   i \n h i !   ! \n h i !   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass13 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!h\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!i\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!\r\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!\nhi!\nhi!hi!\r\n\r\nhi!hi!hi!hi!hi!hi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", 308, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", "hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!\nhi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!hhi!\nhi!\nhi!hi!ihi!\nhi!\nhi!hi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!", "\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!" + "'", str3, "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, \n, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, h, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, i, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !, !, \n, \r, \n, h, i, !, \r, \n, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!", false, 92, (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 70, (-7));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\r\nhi!hi!hi!\nhi!", "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\n\rhi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!", (-224));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
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
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (-61), (-61));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", true, 8, (java.lang.CharSequence) "hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!\rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! \rhi!\rhi!\r\nhi!\r\nhi!hi!\nhi!hi! hi!hi!hi!\rhi!\r\nhi!\r\nhi!hi!\nhi!\r\rhi!\r\nhi!\r\nhi!hi!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!", (-106), (-150));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!" + "'", str3, "hi!\nhi! \rhi!\nhi! hi!hi!\rhi!\nhi! \rhi!\nhi! hi!hi!hi!");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-80));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 19 + "'", int7 == 19);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!", "hi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!" + "'", str3, "\nhi!\r\nhi!hi!");
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 338 + "'", int1 == 338);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) 1, (byte) 1, (short) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, 1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "hi!\nhi!", "", "", "\nhi!", "\n\r\nhi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\rhi!\n\rhi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", (java.lang.CharSequence) "\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!\r\rhi!\n\rhi!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\nhi! \n h i !   \nhi!hi!hi!hi!hi!hi!", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!hi!\nhi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\nhi! \r\nhi! hi!hi!\r\nhi! \r\nhi! hi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        char[] charArray6 = new char[] {};
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
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
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n", "\nhi!\r\nhi!hi!hi!\nhi!", "\n\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nhi!\nhi!hi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!\r\n");
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r", "\r\rhi!\n\rhi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! \nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\nhi! hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\r\nhi!\r\nhi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\r\nhi!hi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r\nhi!\r\nhi!\r\nhi!hi!h\nhi!\r\nhi!hi!i\nhi!\r\nhi!hi!!hi!\n\r");
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\n\r\n\rhi!\n\rhi!\r\n\rhi!\n\rhi!\rhi!\n\rhi!\n\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!\rhi!\n\rhi!", 92, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!hi!hi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\nhi!hi!", "\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!\r\nhi!\r\nhi!hi!\rhi!\r\nhi!\r\nhi!hi!\rhi!hi!hi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-95) + "'", int3 == (-95));
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi! \n h i !   \nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!\n\rhi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 6, 85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\rhi!\r\nhi!\r\nhi!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\n\r\nhi!hi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\rhi!\nhi!hi!hi!hi!\rhi!\nhi!hi!\rhi!\nhi!hi!hi!hi!hi!", 28, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!\nhi!hi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!\n\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!h\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!i\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!!\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!\n\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!h\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!i\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!!\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!hi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!\n\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!h\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!i\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!!\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!\nhi!hi!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hhi!\nhi!hi!ihi!\nhi!hi!!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!\rhi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!hi!hi!hi!\nhi!hi!hi!hi!hi!\nhi!hi!hi!hi!\nhi!hi!hi!hi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }
}

