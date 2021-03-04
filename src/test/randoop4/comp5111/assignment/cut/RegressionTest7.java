package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r ", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r ");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r\n", false, 41, (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", (-476), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", " \n\r \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean17);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        short[] shortArray3 = new short[] { (short) 1, (byte) 10, (short) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 22, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\n", "\n", "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n", "\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 753);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 61, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n", (java.lang.CharSequence) "\n\r\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 0, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi! hi!\nhi!\rhi! hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 82, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        double[] doubleArray3 = new double[] { 1.0f, '\000', 0.0f };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray6);
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
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\nhi!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11) + "'", int3 == (-11));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (int) (short) 100, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", 39, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (-78));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) " \n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true, 72, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-78), 48);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", " ", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-26) + "'", int3 == (-26));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n,  , \n, \n, \n,  , \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, h, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, i, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, !, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n, \n, \n, \r, \n, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 22, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charSequence1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rh\ri\r!\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (-251), (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-475), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 5, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !,  , \n, \r,  , \n, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \n, \r, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, h, i, !]");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", 100, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n\n\n\r\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", true, 2, charSequence3, (-476), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\rh\ri\r!\r", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", 620, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, \n, \r, \r, h, \r, i, \r, !, \r]");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        char[] charArray9 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", false, (-7), (java.lang.CharSequence) "\rh\ri\r!\r", 598, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", false, (-61), charSequence3, 2, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhi!\n\r\n", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        char[] charArray9 = new char[] { 'a', '\000' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        long[] longArray1 = new long[] { (-1L) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!hi!", "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        float[] floatArray1 = new float[] { 1.0f };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass11 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[1.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!\n" + "'", str3, "hi!\nhi!hi!\n");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) " \n\r\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 100, (-61));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\rhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r \n", (-11), (-475));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (-7), (-452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", 27, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n\n\r\n\n\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n", 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 61);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n", "hi!hhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", 80, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "hi!\n\rhi!\n", (-476));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\n", 15, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hhi!ihi!!hi!\rhi!", pattern1, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rhi!" + "'", str3, "hi!hi!hhi!ihi!!hi!\rhi!");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", pattern1, "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18) + "'", int3 == (-18));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", false, 80, (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", 61, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (-452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        double[] doubleArray1 = new double[] { 16 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[16.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n", (int) '\n', 251);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!\n", true, 31, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) (byte) 10, 34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 219 + "'", int1 == 219);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\r\n", charArray9);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", 3, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n", true, 102, (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 8, (-11));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\n", (int) (short) 100, (-251));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        char[] charArray6 = new char[] { 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", pattern1, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", 11, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        char[] charArray7 = new char[] { 'a', '\000' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", "\r\n\r\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\n", "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        long[] longArray5 = new long[] { (-3), (short) 0, (byte) 1, (byte) -1, 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        java.lang.Class<?> wildcardClass13 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-3, 0, 1, -1, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        boolean[] booleanArray3 = new boolean[] { true, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\n\rhi!\n", "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\nhi!", " \n\r \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", true, 5, (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 45, 452);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str17);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "hi!\n", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", " \n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r ", " \n\r \n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r ");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, 7, (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 18, 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        char[] charArray11 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, h, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, i, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, !, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n, \n, h, i, !, \n, h, h, i, !, \n, i, h, i, !, \n, !, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false, 620, (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-26), 41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 100, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi!", "\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        char[] charArray8 = new char[] { 'a', '\000' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n" + "'", str3, " \n\r\n");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r \n", pattern1, "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \n" + "'", str3, " \n\r \n");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false, 20, charSequence3, (-78), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", 219);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false, 251, (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (-19), 37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 28, (-26));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hhi!ihi!!hi!\nhi!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", pattern1, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass6 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", false, 107, (java.lang.CharSequence) " \n\r \n", (int) (short) -1, 620);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \n, \r, \n, \n, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n]");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (-251), (java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 94, 31);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!" + "'", str3, "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 598, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 431 + "'", int1 == 431);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", pattern1, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hhi!ihi!!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " \n\r\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", pattern1, "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n" + "'", str3, " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        boolean[] booleanArray5 = new boolean[] { true, true, true, true, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charSequence1, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-476));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\n\n\r\n\n\n\rhi!\n", pattern1, "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi! hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi! hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!?hi! hi!?hi!hi!hhi!ihi!!hi!?hi!hi! hi!?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r", "\rh\ri\r!\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 80, (java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", (-476), 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (int) ' ', (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 99, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", false, 455, (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (int) (short) 0, 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 219, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n\r\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\n", false, (-30), (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 753, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\n\n\r\n\n\n\rhi!\n", "\rh\ri\r!\r", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 30, (-452));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\n\r\n\n\n", pattern1, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\n\r\n\n\n" + "'", str3, "\n\n\n\r\n\n\n");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 2, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n", (-251));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!hhi!ihi!!hi!?h?i?!?hi!?hi!hhi!ihi!!hi!?h?i?!?hi!hi!hhi!ihi!!hi!?h?i?!?hi!?hi!hhi!ihi!!hi!?h?i?!?hi!?hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 753, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, " \n\r \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r \n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", (-251), 753);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        char[] charArray12 = new char[] { '\000', '4', '4', '\000', 'a', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\00044\000a#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\00044\000a#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, 4, 4, \000, a, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\n\n\r\n\n\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\n\n\r\n\n\n\rhi!\n" + "'", str3, "hi!\n\n\n\r\n\n\n\rhi!\n");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\rhi!\n", "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\n");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", 0, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (-210));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!\n\r\rh\ri\r!\r", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi! hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r ", pattern1, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r " + "'", str3, "\rh\ri\r!\r ");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", 1, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 82, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (-78));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", "hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 72, (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (-475), (-251));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (-251));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", 48, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\rhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!", (java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        char[] charArray3 = new char[] {};
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true, (int) 'a', (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (int) (byte) 100, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "\rh\ri\r!\r", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 133, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!hhi!ihi!!hi!\nhi!hi!", "hi!\n\n\n\r\n\n\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!", false, (-251), (java.lang.CharSequence) "hi!\nhi!hi!\n", 30, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        char[] charArray6 = new char[] { 'a', '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, \000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!" + "'", str3, "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r", (-26), 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r ", (-4), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhi!hi!", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n", (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str18 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", 44, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r\n", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (-210), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        float[] floatArray4 = new float[] { (-61), 20, (-451), 7 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-61.0, 20.0, -451.0, 7.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-598) + "'", int3 == (-598));
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\n\r\rh\ri\r!\r", pattern1, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\n\r\rh\ri\r!\r" + "'", str3, "hi!hi!\n\r\rh\ri\r!\r");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", (java.lang.CharSequence) " \n\r\n", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n, \n, h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "hi!\n\r\n", "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        comp5111.assignment.cut.ToolBox toolBox0 = new comp5111.assignment.cut.ToolBox();
        java.lang.Class<?> wildcardClass1 = toolBox0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true, 83, (java.lang.CharSequence) "\n", 0, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r" + "'", str3, "\rh\ri\r!\r");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charSequence1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!", (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n\r\n", pattern1, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r \n", " ", "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n" + "'", str3, "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "\n\r\n \n\n\n \n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\nh\n\r\n\n\r\n\n\n\r\n\n\r\ni\n\r\n\n\r\n\n\n\r\n\n\r\n!\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n\n\n\r\n\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!h\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r ", (java.lang.CharSequence) " \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", (java.lang.CharSequence) "\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\n\nhi!hhi!ihi!!hi!\nhi!\n\r\nhhi!hhi!ihi!!hi!\nhi!\n\r\nihi!hhi!ihi!!hi!\nhi!\n\r\n!hi!hhi!ihi!!hi!\nhi!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", pattern1, "\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \n\r\n", (-452));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", pattern1, "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", (java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", " \n\r \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 78 + "'", int3 == 78);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        double[] doubleArray5 = new double[] { 16, '\n', 100L, 10L, 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[16.0, 10.0, 100.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!\nhi!\rhi! hi!\nhi!", "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (int) 'a', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r", "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!hi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", true, (int) (short) 0, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!\n\r\n", 22, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\n\r\n\n\n", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n" + "'", str3, "hi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!\n");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!", charArray3);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hhi!ihi!!hi!\nhi!hi!", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!", pattern1, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhi!");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int[] intArray6 = new int[] { (-4), '4', 'a', (short) 10, (byte) 100, 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        java.lang.Class<?> wildcardClass10 = intArray6.getClass();
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-4, 52, 97, 10, 100, 97]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r, h, h, i, !, i, h, i, !, !, h, i, !, h, h, i, !, i, h, i, !, !,  , \n, \r,  , \n, h, i, !, h, i, !, h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\nhi!", false, 38, (java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!! \n\r \nhi!hi!hi!hi!", (-598), (-476));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! hi!\nhi!\rhi! hi!\nhi!", 41, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        long[] longArray4 = new long[] { (byte) 0, 4, (-1L), (short) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        java.lang.Class<?> wildcardClass11 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 4, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\n\r\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", 78, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r", false, 142, (java.lang.CharSequence) "\n\rhi!\nhi! hi!\nhi!hi!\nhi!hi!\nhi! hi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 18, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\n\n\n\r\n\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!hhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", pattern1, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nh\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\ni\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\nhhi!ihi!!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n" + "'", str3, "\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\r\n", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", "\rh\ri\r!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\r\n" + "'", str3, "hi!\n\r\n");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r", 474, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi!\n\rhi!\n", "hi!\nhi!hi!\n" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "\rh\ri\r!\rhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\nhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n" + "'", str3, "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", pattern1, "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n" + "'", str3, "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\n\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n", "hi!", "", "hi!\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!", "hi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\nhi!\n\rhi!\n", "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!" + "'", str3, "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!ihi!!hi!\nhi!hi!");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, h, i, !, \n, \r, h, i, !, \n, \r, h, i, !, \n, h, i, !, \n, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\n\rhi!\n\n\rhi!\n\rhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, \r, h, i, !, \n, \n, \r, h, i, !, \n, \r, h, i, !, \n, \n]");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n\n\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18 + "'", int13 == 18);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\n\r\rh\ri\r!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\rhi!\n", charArray7);
        java.lang.Class<?> wildcardClass14 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\rhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!hhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!ihi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!!hi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!\nhi! hi!\nhi!hi!hhi!ihi!!hi!\nhi!hi! hi!\nhi!", false, (int) (byte) 0, (java.lang.CharSequence) "", (-475), 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\rhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!hi!hi!hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\n\rhi!\n", (java.lang.CharSequence) "hi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi! hi!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r\n", pattern1, "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r\n" + "'", str3, "\r\n\r\n");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi! \n\r \nhi!hhi!ihi!!hi!\nhi!\n\r\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", (java.lang.CharSequence) "hi!\n\r\n", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 39 + "'", int3 == 39);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nhhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\nihi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n!hi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n\nhi!\n\rhi!\nhi!\n\rhi!\n", 100, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hhi!ihi!!hi!\rhi!hhi!ihi!!hi!\nhi!hi!", (java.lang.CharSequence) "\n\n\n\r\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!", pattern1, "hi!hhi!ihi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!" + "'", str3, "hi!hhi!ihi!!hi!hi!hhi!ihi!!hi!\nhi!\rhi!hhi!ihi!!hi!\nhi!\rhi!\nhi!\n\rhi!\nhi!\rhi!hhi!ihi!!hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\nhi!");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\n\n\r\n\n\n\rhi!\n", (java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n\nhi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
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
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n\rhi!\n\rhi!\nhi!\n\rhi!\n", charSequence1, 474);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!", "hi!\n\r\n", "hi!\n\rhi!\nhi!\n\rhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!" + "'", str3, "hi!hhi!ihi!!hi!\rh\ri\r!\rhi!\rhi!hhi!ihi!!hi!\rh\ri\r!\rhi!");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\rhhi!ihi!!hi!hhi!ihi!!hi!\nhi!hi!hi!hi!\rhi!\nhi!\nhi!\n\rhi!\nhi!\n\rhi!\nhi!\n", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hi!\rhi!hhi!ihi!!hi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

