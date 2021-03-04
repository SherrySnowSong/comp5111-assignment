package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! ", pattern1, "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! " + "'", str3, "  h i ! ");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        char[] charArray4 = new char[] { 'a', '4', '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        java.lang.Class<?> wildcardClass6 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true, 3, (java.lang.CharSequence) "hi!\r", (int) (byte) 0, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        java.lang.Class<?> wildcardClass26 = strArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "\nhi!hi! h i ! ", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (int) (byte) 1, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\n\nh\ni\n!\n\n", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! ", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\nh\ni\n!\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", 15, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", false, 4, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !?hi!  h i !  ?hi!  h i !  h i ! ?hi!  h i !  ?hi!  h i !  h i ! h?hi!  h i !  ?hi!  h i !  h i ! i?hi!  h i !  ?hi!  h i !  h i ! !?hi!  h i !  ?hi!  h i !  h i ! hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! h?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! i?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! !?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! ", pattern1, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! " + "'", str3, "  h i ! ");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (java.lang.CharSequence) "\n  h i ! \n", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\n", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", 100, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", 74, (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\n\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! ", "\n\nh\ni\n!\n\n", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! ", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (int) (byte) -1, 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "\r", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 203 + "'", int1 == 203);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! " + "'", str3, " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n \n h i !  h i ! \n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", false, 7, (java.lang.CharSequence) "", 219, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", pattern1, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n" + "'", str3, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n", (int) (short) -1, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (-77));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i ! \r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 339 + "'", int1 == 339);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\nhi!hi! h i ! ", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n  h i ! \n", true, 52, (java.lang.CharSequence) "\nhi!  h i ! \n", 7, 203);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \n", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 339);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int26);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        float[] floatArray2 = new float[] { (byte) -1, (short) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "  h i ! \n   h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", pattern1, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray10 = new char[] { 'a', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\r", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r" + "'", str3, "hi!\r");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", 14, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h i ! ", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 5, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! hi!\r   h i ! hi!\r", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! hi!\r   h i ! hi!\r" + "'", str3, "  h i ! hi!\r   h i ! hi!\r");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r", 63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!", "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!  h i ! \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", 4, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\nhi!  h i ! \r \n h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 4, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
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
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (short) 1, 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n h i ! ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 91, (-22));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i ! ", (java.lang.CharSequence) "  h i ! \n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nh\ni\n!\n", "  h i ! hi!\r   h i ! hi!\r", "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 163);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n h i !  h i ! \n", 9, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        long[] longArray1 = new long[] { 14 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[14]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        char[] charArray6 = new char[] { 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int26);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n h i ! ", "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "  h i ! \n   h i ! \n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n   h i ! \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! \n   h i ! \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , \n,  ,  ,  , h,  , i,  , !,  , \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "  h i ! \n   h i ! \n", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !,  ,  , h,  , i,  , !,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 94, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        char[] charArray6 = new char[] { 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        float[] floatArray4 = new float[] { (-8), 94, 10.0f, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-8.0, 94.0, 10.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! ", "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        char[] charArray7 = new char[] { '\r', '4', '\r', '4', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r4\r44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r4\r44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, 4, \r, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "  h i ! \n   h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n h i ! ", (int) '#', (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 59 + "'", int1 == 59);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        short[] shortArray4 = new short[] { (byte) 10, (byte) 10, (short) 0, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, 10, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 4, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        char[] charArray9 = new char[] { 'a', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n   h i ! \n", pattern1, "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 0, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", 203, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", (-53), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \n", "\nhi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, h, \n, h, i, !, i, \n, h, i, !, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "hi!", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        char[] charArray3 = new char[] { 'a' };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[a]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi! h i ! \n", "\n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n" + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", "\nhi!  h i ! \n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "  h i ! hi!\r   h i ! hi!\r", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r", pattern1, "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r" + "'", str3, "\nhi!  h i ! \r");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \n", false, (-53), (java.lang.CharSequence) "\nhi!  h i ! ", (-3), 59);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h i ! \n", " ", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray11 = new char[] { 'a', '4', '#' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n   h i ! \n", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 59 + "'", int3 == 59);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! ", pattern1, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.String str24 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        java.lang.String str25 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n h i !  h i ! \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  , \n,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n]");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!  h i ! \r", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 133, charSequence3, 12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 109 + "'", int3 == 109);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\nhi!hi! h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-10) + "'", int3 == (-10));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n h i ! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nh\ni\n!\n\n", (java.lang.CharSequence) "hi!\r", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", pattern1, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! ", true, (-12), charSequence3, 13, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n  h i ! \n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! " + "'", str3, "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \n", false, (-53), (java.lang.CharSequence) "\n \n h i !  h i ! \n", 12, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 0, 10]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! ", (int) '\000', 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\nh\ni\n!\n\n", "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h i ! ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n" + "'", str3, "\n  h i ! \n");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        char[] charArray6 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", (java.lang.CharSequence) "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        int[] intArray5 = new int[] { (short) 1, '\000', 94, (short) 0, (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 0, 94, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (java.lang.CharSequence) "\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-70) + "'", int3 == (-70));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        float[] floatArray1 = new float[] { '\n' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass10 = floatArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n", pattern1, "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , h,  , i,  , !,  , h, i, !, \r,  ,  ,  , h,  , i,  , !,  , h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int[] intArray4 = new int[] { (-91), 10, (byte) 100, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-91, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", false, 5, (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 5, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        char[] charArray7 = new char[] { 'a', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \r", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
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
        int int23 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!?hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!?hi!h?hi!i?hi!!?hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \n", 16, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        char[] charArray10 = new char[] { ' ', '#', '#', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        java.lang.Class<?> wildcardClass19 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! ", pattern1, "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! " + "'", str3, "  h i ! ");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\n", "\nhi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n" + "'", str3, " \n");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        int int23 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        char[] charArray7 = new char[] { ' ', '#', '#', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 203, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! ?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! h?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! i?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! !?hi!?hi!hi! h i !  ?hi!?hi!hi! h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) "  h i ! \n   h i ! \n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "  h i ! \n   h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 91);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n", (int) (byte) -1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 9, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", 164, 223);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi! h i ! \n", 339, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        char[] charArray3 = new char[] { ' ', '#' };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , #]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 133 + "'", int4 == 133);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! ", pattern1, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (int) 'a', 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   h i ! ?h  h i ! ?i  h i ! ?!  h i ! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !, \r]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 55 + "'", int1 == 55);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???h?i?!???h?i?!?h?i?!? ?h? ?i? ?!? ? ???h?i?!? ? ?h? ?i? ?!? ? ?h? ?i? ?!? ???h?i?!? ? ?h? ?i? ?!? ? ???h?i?!? ? ?h? ?i? ?!? ? ?h? ?i? ?!? ?h???h?i?!? ? ?h? ?i? ?!? ? ???h?i?!? ? ?h? ?i? ?!? ? ?h? ?i? ?!? ?i???h?i?!? ? ?h? ?i? ?!? ? ???h?i?!? ? ?h? ?i? ?!? ? ?h? ?i? ?!? ?!???h?i?!? ? ?h? ?i? ?!? ? ???h?i?!? ? ?h? ?i? ?!? ? ?h? ?i? ?!? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (java.lang.CharSequence) "\n \n h i !  h i ! \n", 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", "\nhi!  h i ! \n", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, h, \n, h, i, !, i, \n, h, i, !, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "\n\nh\ni\n!\n\n", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n", charSequence1, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  h i ! \n", 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, 14, (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (int) (byte) -1, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  h i ! ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  h i ! h?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  h i ! i?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  h i ! !?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  ?? ? h i !  h i ! ??? ? h i !  h i ! ?  h i !  h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", 66, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", 59, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 53);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) " \n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str24);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", "  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n h i !  h i ! \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! ", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
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
        java.lang.String str21 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str21);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !,  ,  , h,  , i,  , !,  ,  , \n, h, i, !,  ,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        short[] shortArray6 = new short[] { (byte) 100, (short) 0, (short) -1, (byte) 10, (byte) 100, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        java.lang.Class<?> wildcardClass10 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 10, 100, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", (-8), 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\nh\ni\n!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int26 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.String str27 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean28 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "hi!", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n h i ! ", "\n  h i ! \n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (-1), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 109);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r", "\nhi!  h i ! \r \n h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        char[] charArray7 = new char[] { '\r', '4', '\r', '4', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r4\r44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r4\r44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, 4, \r, 4, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n", " \n", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n" + "'", str3, "\nhi!\n");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        char[] charArray10 = new char[] { 'a', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h i ! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray10);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        char[] charArray9 = new char[] { ' ', '#', '#', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n h i ! ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " ## ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, #,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", false, (int) '4', (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", (int) '\n', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", charSequence1, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n   h i ! \n", " \n h i ! ", "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", (java.lang.CharSequence) "  h i ! \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        java.lang.String str26 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray7);
        boolean boolean27 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \n", (java.lang.CharSequence) "\n\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n", "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  h i ! \n", true, 0, (java.lang.CharSequence) "\n  h i ! \n", (int) (byte) 1, (-19));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! \n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n", pattern1, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?hi!hi!?hi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  h i ! ", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\nh\ni\n!\n", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", "  h i ! hi!\r   h i ! hi!\r", "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", " \n", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!  h i ! \n", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! ", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 63, 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", (java.lang.CharSequence) "hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "\n\nh\ni\n!\n", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r", (int) (short) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (int) (byte) 1, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   h i ! ?h  h i ! ?i  h i ! ?!  h i ! ?  h i ! ?h  h i ! ?i  h i ! ?!  h i ! ?h  h i ! ?h  h i ! ?i  h i ! ?!  h i ! ?i  h i ! ?h  h i ! ?i  h i ! ?!  h i ! ?!  h i ! ?h  h i ! ?i  h i ! ?!  h i ! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!  h i ! \r \n h i ! ", "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!  h i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        long[] longArray1 = new long[] { 9 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        java.lang.Class<?> wildcardClass5 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[9]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , h, \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , i, \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , h,  , i,  , !,  , !, \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , \n, h, i, !, \n, h, i, !, h, i, !,  , h,  , i,  , !,  ,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", pattern1, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!\n", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (-70), 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 77 + "'", int1 == 77);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", " ", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\nhi!  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r", (java.lang.CharSequence) "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", pattern1, "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! " + "'", str3, "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        char[] charArray5 = new char[] { 'a' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n  h i ! \n", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!hi! h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n", (java.lang.CharSequence) "\nhi!hi! h i ! ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\nhi!h\nhi!i\nhi!!\nhi!", " \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!  h i ! \n", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean25 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", (java.lang.CharSequence) " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \n h i ! ", "\n  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", pattern1, "  h i ! \n   h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", true, 163, (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", 15, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", 1, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", "\nhi!  h i ! \r \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n", pattern1, "\nhi!hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\nhi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n", "  h i ! \n", "\nhi!  h i ! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n" + "'", str3, "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h i ! ", 109, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 109 + "'", int1 == 109);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n", (java.lang.CharSequence) "\nhi!  h i ! \r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! hi!\nhi! h i ! \n", (java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n h i ! ", pattern1, "\nhi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n h i ! " + "'", str3, " \n h i ! ");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, (-91), (java.lang.CharSequence) "\n", 53, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "\nhi!\nhi!h\nhi!i\nhi!!\nhi!", "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! " + "'", str3, "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nh\ni\n!\n\n", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  , \n,  , h,  , i,  , !,  , \n,  , \n,  , h,  , i,  , !,  , h, \n,  , \n,  , h,  , i,  , !,  , i, \n,  , \n,  , h,  , i,  , !,  , !, \n,  , \n,  , h,  , i,  , !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nh\ni\n!\n", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!\r", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 339);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!", "\nhi!  h i ! \r", "\nhi!  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi! h i ! ", pattern1, "\n\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi! h i ! " + "'", str3, "\nhi!hi! h i ! ");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n h i ! ", false, 23, (java.lang.CharSequence) "\n", (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", "hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        char[] charArray5 = new char[] { '4', ' ', 'a', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4 a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4 a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4,  , a, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", pattern1, "\nhi!hi! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! " + "'", str3, "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\n \n h i !  h i ! \n", "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray7);
        int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", false, 0, (java.lang.CharSequence) "\nhi!\nhi! h i ! \n", (-70), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        float[] floatArray1 = new float[] { (-8) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[-8.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\nhi!  h i ! ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n", pattern1, " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!\n\nh\ni\n!\n");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        float[] floatArray3 = new float[] { (-1), 22, 3 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        java.lang.Class<?> wildcardClass5 = floatArray3.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[-1.0, 22.0, 3.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!  h i ! \r", (java.lang.CharSequence) "  h i ! hi!\r   h i ! hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        char[] charArray8 = new char[] { 'a', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        int int24 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray7);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n\n", "\nhi!  h i ! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", charSequence1, 164);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h i ! ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  h i ! ", (java.lang.CharSequence) "\nhi!hi! h i ! \n\nhi!hi! h i ! h\nhi!hi! h i ! i\nhi!hi! h i ! !\nhi!hi! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \n   h i ! \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n   h i ! \n" + "'", str3, "  h i ! \n   h i ! \n");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 68);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n h i !  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \n" + "'", str3, "\nhi!  h i ! \n");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n  h i ! \n", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!" + "'", str3, "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\nh\ni\n!\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
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
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int25 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass26 = strArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \nh\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \ni\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n!\n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \n\n\nh\ni\n!\n \n \nh\n \ni\n \n!\n \n \nh\n \ni\n \n!\n \n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \nh  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \ni  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n!  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!  h i ! \r \n h i ! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " \n", "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! \nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", 91, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n  h i ! \n", (-159), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h i ! \n  h i ! h  h i ! i  h i ! !  h i ! h  h i ! i  h i ! !  h i !    h i ! h  h i !    h i ! i  h i !    h i ! !  h i !    h i ! ", (java.lang.CharSequence) "  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        char[] charArray6 = new char[] { 'a', '4', '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi! h i ! ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!", "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-373) + "'", int3 == (-373));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n", pattern1, "  h i ! \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n" + "'", str3, "  h i ! \nh  h i ! \ni  h i ! \n!  h i ! \n");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !\nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! hi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! h\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! i\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! !\nhi!\nhi!hi! h i !  \nhi!\nhi!hi! h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ", pattern1, " \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! " + "'", str3, "\nhi!  h i ! \r \n h i ! hi!  h i ! \nhi!  h i ! \r \n h i ! ");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n", pattern1, " \n h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n" + "'", str3, "\n  h i ! \n \n  h i ! \n \n  h i ! \nh\n  h i ! \n \n  h i ! \ni\n  h i ! \n \n  h i ! \n!\n  h i ! \n \n  h i ! \n\n\n  h i ! \n");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!", "\n\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi! h i ! ", (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!hhi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!ihi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!!hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi! hi!hhi! hi!ihi! hi!!hi! hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi!hhi!ihi!!hi!hhi!ihi!!hi!hi!hhi!hi!ihi!hi!!hi!hi!hi!\nhi!h\nhi!i\nhi!!\nhi!  h i ! \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!  h i ! ", " \nhi!  h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ", "\n\nh\ni\n!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!  h i ! " + "'", str3, "\nhi!  h i ! ");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi! h i ! ", (java.lang.CharSequence) "\nhi!\nhi!hi! h i !  \nhi!  h i !  h i ! \nhi!  h i !  \nhi!  h i !  h i ! h\nhi!  h i !  \nhi!  h i !  h i ! i\nhi!  h i !  \nhi!  h i !  h i ! !\nhi!  h i !  \nhi!  h i !  h i ! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! h\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! i\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! !\n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  \n\n \n h i !  h i ! \n\n\n \n h i !  h i ! \n  h i !  h i ! ", (java.lang.CharSequence) "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! \nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! h\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! i\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! !\nhi!\nhi!  h i !  \nhi!\nhi!  h i !  h i ! ", (-53), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ", "\nhi!\nhi! h i ! \n", "  h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! " + "'", str3, "\n \n h i ! \n \n h i ! h\n \n h i ! i\n \n h i ! !\n \n h i ! ");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h i ! \n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h i ! \n" + "'", str3, "  h i ! \n");
    }
}

