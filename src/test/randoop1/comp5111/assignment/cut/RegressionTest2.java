package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (int) (short) 10, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " \n h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "  h i ! hi!\r   h i ! hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "hi!\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n", pattern1, "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass25 = strArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "  h i ! ", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        short[] shortArray3 = new short[] { (byte) 100, (short) 100, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (int) '4', (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \n", pattern1, "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n h i !  h i ! \n", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! ", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! " + "'", str3, "  h i ! ");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\nhi!  h i ! \r \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \n", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", 6, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 12, (java.lang.CharSequence) "\nhi!  h i ! \r", (-8), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?hi!  h i !  ?hi!  h i !  h i ! ?hi!  h i !  ?hi!  h i !  h i ! h?hi!  h i !  ?hi!  h i !  h i ! i?hi!  h i !  ?hi!  h i !  h i ! !?hi!  h i !  ?hi!  h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n   h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r", pattern1, "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \n", 3, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        java.lang.String str29 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! hi!\r   h i ! hi!\r", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r", (-94), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-94), 72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r", "\nhi!hi! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! ", (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\r", "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (int) (byte) 0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        java.lang.Class<?> wildcardClass5 = shortArray0.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 8, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n", " \n h i ! ", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        char[] charArray9 = new char[] { '\000', '\n', 'a', '\n', '#', '\000' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\000\na\n#\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\000, \n, a, \n, #, \000]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r", 1, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  h i ! \n   h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   h i ! ?   h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! ", "\nhi!hi! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-53), (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!  h i ! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!  h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray5);
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \n", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi! h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (short) -1, (byte) 10, (byte) 100, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        java.lang.Class<?> wildcardClass9 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n   h i ! \n", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  , h, \n,  , \n,  , h,  , i,  , !,  , i, \n,  , \n,  , h,  , i,  , !,  , !, \n,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i !  h i ! \n", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " ", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! ", "\r", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!  h i ! \n", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        char[] charArray5 = new char[] { 'a', '4', '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nh\ni\n!\n", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n", "", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n" + "'", str3, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "  h i ! \n   h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! ", "hi!\r", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n", " \n h i ! ", "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n" + "'", str3, "\n\nh\ni\n!\n\n");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \n", 164, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", true, (-53), (java.lang.CharSequence) "\n", (-1), 18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\r", "  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r" + "'", str3, "hi!\r");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i ! \n", "\nhi!\nhi! h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n   h i ! \n", true, (-1), (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (int) (byte) -1, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "\n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n  h i ! \n", false, 12, (java.lang.CharSequence) "\n\nh\ni\n!\n\n", 53, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! \n   h i ! \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n  h i ! \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , \n,  ,  ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n   h i ! \n", pattern1, "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi! h i ! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n h i ! ", true, (-72), (java.lang.CharSequence) "\n\nh\ni\n!\n", 23, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n h i !  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? h i !  h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\n", "\nhi!hi! h i ! ", "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray9);
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\nhi!  h i ! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r", pattern1, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r" + "'", str3, "hi!\r");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 9, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass9 = byteArray4.getClass();
        double[] doubleArray10 = new double[] {};
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray10);
        char[] charArray18 = new char[] { ' ', '#', '#', ' ' };
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray18);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray18);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray18);
        java.lang.Object[] objArray22 = new java.lang.Object[] { byteArray4, doubleArray10, charArray18 };
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray22);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 10, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[[-1, 100, 10, -1], [], [ , #, #,  ]]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 19, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false, (int) 'a', (java.lang.CharSequence) "\nhi!  h i ! \n", (-1), (-13));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 163);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-12), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) " \n h i ! ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", "\nhi!  h i ! \r", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n", "\nhi!  h i ! \r \n h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass5 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", (-22), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 9, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\r", 0, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nh\ni\n!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-77) + "'", int3 == (-77));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 169 + "'", int1 == 169);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n \n h i !  h i ! \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\n", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double[] doubleArray2 = new double[] { 10L, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n", true, 19, (java.lang.CharSequence) "\n\nh\ni\n!\n\n", (int) (short) 0, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
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
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int27 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        comp5111.assignment.cut.ToolBox.ArrayTools arrayTools0 = new comp5111.assignment.cut.ToolBox.ArrayTools();
        java.lang.Class<?> wildcardClass1 = arrayTools0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", 55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "hi!", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !,  ,  , h,  , i,  , !,  , \n]");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! ", "\nhi!  h i ! \r", "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n", " ", "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int[] intArray5 = new int[] { (short) 1, '\000', 94, (short) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 94, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r", false, 0, (java.lang.CharSequence) "", (-3), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        java.lang.String str20 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.Class<?> wildcardClass21 = strArray7.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n", true, (-12), (java.lang.CharSequence) "\nhi!hi! h i ! ", (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 66 + "'", int3 == 66);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true, 133, (java.lang.CharSequence) "\n\nh\ni\n!\n", 133, 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) " ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-13), (java.lang.CharSequence) "\n\nh\ni\n!\n\n", (int) '\r', (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n h i !  h i ! \n", 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?  h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        float[] floatArray1 = new float[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \n", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double[] doubleArray2 = new double[] { 10L, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[10.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i ! \r", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-159) + "'", int3 == (-159));
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n h i ! ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \n", "  h i ! \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 74, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  h i ! ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!  h i ! \r \n h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n" + "'", str3, "\n\nh\ni\n!\n\n");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\nhi!hi! h i ! ", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\nh\ni\n!\n\n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n h i ! ", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nh\ni\n!\n\n", "\nhi!\nhi! h i ! \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n" + "'", str3, "\n\nh\ni\n!\n\n");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h i ! ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i !  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n   h i ! \n", false, (int) (short) 1, (java.lang.CharSequence) "\nhi!  h i ! \r", (int) (short) 100, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", "\nhi!  h i ! \r \n h i ! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", pattern1, "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        char[] charArray3 = new char[] { 'a' };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 163, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "\n\nh\ni\n!\n", (-159));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", true, 0, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (int) '\r', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\n  h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  h i ! \n", "  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i ! \n", "\n", "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        float[] floatArray1 = new float[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi! h i ! \n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "\nhi!\nhi! h i ! \n", "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n", "\n \n h i !  h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n   h i ! \n", false, (int) '#', (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (-12), 133);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n h i ! ", 169);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\nh\ni\n!\n\n", false, (-94), (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 23, (-159));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! ", pattern1, "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", "\nhi!", "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", 133, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (int) '\000', 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "\n  h i ! \n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (int) '#', (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "  h i ! ", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) (byte) 10, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", pattern1, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\nhi!\nhi! h i ! \n", "\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 10, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 68 + "'", int3 == 68);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  , h, \n,  , \n,  , h,  , i,  , !,  , i, \n,  , \n,  , h,  , i,  , !,  , !, \n,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "\nhi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 12, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\r", true, (-1), (java.lang.CharSequence) "  h i ! \n   h i ! \n", 1, 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i ! ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean[] booleanArray4 = new boolean[] { true, false, true, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 12, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
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
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int24);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-53));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", "\nhi!  h i ! ", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charSequence1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (int) ' ', (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! hi!\r   h i ! hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi! h i ! \n", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi! h i ! \n" + "'", str3, "\nhi!\nhi! h i ! \n");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (-3), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!\nhi! h i ! \n", "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i ! ", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-77));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", "hi!", "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "\n\nh\ni\n!\n\n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", 169);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n h i ! ", 18, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi! h i ! ", "\nhi!\nhi! h i ! \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, charSequence1, (-13));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! ", "\nhi!  h i ! \n", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i ! \n", "  h i ! \n   h i ! \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 223 + "'", int3 == 223);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "  h i ! ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!\nhi! h i ! \n", "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, h, i, !,  , h,  , i,  , !,  , \n, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , h, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , i, \n, h, i, !, h, i, !,  , h,  , i,  , !,  , !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n  h i ! \n", "hi!\r", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!hi! h i !  ?hi!  h i !  h i ! ?hi!  h i !  ?hi!  h i !  h i ! h?hi!  h i !  ?hi!  h i !  h i ! i?hi!  h i !  ?hi!  h i !  h i ! !?hi!  h i !  ?hi!  h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n  h i ! \n", 53, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r", "\n  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) " ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "  h i ! \n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n  h i ! \n", "  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", pattern1, "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 91);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! ", "  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        boolean[] booleanArray2 = new boolean[] { false, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[false, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "\nhi!  h i ! ", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", false, 8, (java.lang.CharSequence) "\r", 66, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n   h i ! \n", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n   h i ! \n", pattern1, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n h i ! ", 55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-19), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "\r", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "hi!\r", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "\n  h i ! \n", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\n", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        char[] charArray5 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi! h i ! ", false, (int) '#', (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (int) '\000', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  h i ! \n   h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", pattern1, " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! ", 66, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  h i ! \n   h i ! \n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", 5, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n\n", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n" + "'", str3, "\n\nh\ni\n!\n\n");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i !  h i ! \n", pattern1, "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i !  h i ! \n" + "'", str3, "\n \n h i !  h i ! \n");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h i ! \n", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (-8), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 219 + "'", int3 == 219);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-13), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", pattern1, "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", " \n h i ! ", "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n \n h i !  h i ! \n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n \n h i !  h i ! \n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) (short) 10, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\n\nh\ni\n!\n\n", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \n", false, 52, (java.lang.CharSequence) "\n \n h i !  h i ! \n", (-13), 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n  h i ! \n", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i ! ", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false, 219, (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", 15, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.Class<?> wildcardClass27 = strArray7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! ", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n  h i ! \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
        boolean boolean26 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int27 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        char[] charArray10 = new char[] { 'a', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        char[] charArray8 = new char[] { ' ', '#', '#', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray7);
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

