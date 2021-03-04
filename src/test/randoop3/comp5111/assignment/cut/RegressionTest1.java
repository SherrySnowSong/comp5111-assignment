package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) "hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        short[] shortArray4 = new short[] { (byte) 100, (byte) 10, (short) 100, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass6 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, 10, 100, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true, (-91), (java.lang.CharSequence) "\n\r\n", 91, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        short[] shortArray2 = new short[] { (byte) -1, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass5 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true, (int) (short) 1, (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) (short) 100, 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!", (-91), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (int) (byte) 1, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", "hi!\nhi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!\r\nhi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        char[] charArray7 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (-7), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!", "", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true, (-5), (java.lang.CharSequence) "\rhi!", 91, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String[] strArray6 = new java.lang.String[] { " ", "\n", "", "\r", "\n\r\nhi!", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rhi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        double[] doubleArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
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
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-51) + "'", int3 == (-51));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 307 + "'", int1 == 307);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!", 0, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (int) '\r', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        float[] floatArray3 = new float[] { 10L, 0.0f, 0L };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "\n\r\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        java.lang.Class<?> wildcardClass3 = charSequenceArray1.getClass();
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!", charArray3);
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-5), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) (short) 0, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false, (-72), (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", 22, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (-4), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "hi!\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "hi!\nhi!hi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false, (-91), charSequence3, 100, 91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (int) 'a', (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\rhi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", charSequence1, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\nhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\nhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi!", "hi!\nhi!\nhi!hi!", "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false, 22, charSequence3, (int) (short) 100, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!hi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!" + "'", str3, "hi!\nhi!hi!");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-12) + "'", int3 == (-12));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!", false, 3, (java.lang.CharSequence) " ", 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", pattern1, "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (int) '\r', 307);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!", "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        java.lang.Class<?> wildcardClass5 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!", false, 10, (java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 12, 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\nhi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        char[] charArray5 = new char[] {};
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray5);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!", pattern1, "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\r\nhi!hi!", "\r", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) " ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????h???i???!???????????h???i???!???h???i???!???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!", "\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi!\nhi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rhi!", true, (-1), (java.lang.CharSequence) "\r", 3, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        java.lang.Class<?> wildcardClass4 = booleanArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\nhi!", "\nhi!\r\nhi!hi!", "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!", 76, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\n", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", 0, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "hi!", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!" + "'", str3, "hi!\nhi!hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", false, (int) '4', (java.lang.CharSequence) "hi!\nhi!", 22, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", false, 164, (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-22), (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "\n", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 39 + "'", int1 == 39);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "\n", "hi!", "\r", "\n", "hi!" };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        double[] doubleArray1 = new double[] { (-7) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[-7.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!\r\nhi!hi!", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) (short) 10, 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\r\n", "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (int) (byte) 100, (java.lang.CharSequence) " ", (-7), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false, (int) (byte) -1, (java.lang.CharSequence) "\r", (-72), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!", "\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 0, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (int) '\000', 164);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (-12), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!", "\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, (-72), (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 0, (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "", "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        long[] longArray2 = new long[] { (short) -1, 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        java.lang.Class<?> wildcardClass6 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "\nhi! ", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (-1), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!", "", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray2);
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi! ", pattern1, "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-39) + "'", int3 == (-39));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 5, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        byte[] byteArray2 = new byte[] { (byte) 0, (byte) 100 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", true, (int) (short) -1, (java.lang.CharSequence) "\n", (-4), 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) '\n', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!", true, (int) '\n', (java.lang.CharSequence) "hi!", (int) (short) 100, (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!hi!" + "'", str3, "hi!\nhi!hi!");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray4);
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 5, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        short[] shortArray3 = new short[] { (byte) 100, (byte) 0, (short) -1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray3);
        java.lang.Class<?> wildcardClass8 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[100, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "\n\r\nhi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-72), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\rhi!\n\rhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\n\r\nhi!", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\rhi!", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!", false, 91, (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", 0, (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!", "\rhi!", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", false, (-72), (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 10, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        boolean[] booleanArray1 = new boolean[] { false };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        java.lang.Class<?> wildcardClass4 = booleanArray1.getClass();
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!", "hi!\nhi!hi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!", pattern1, "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", pattern1, "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi! ", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi! " + "'", str3, "\nhi! ");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 7, (java.lang.CharSequence) "hi!", 72, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-158) + "'", int3 == (-158));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", true, 7, (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", 3, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!", "\rhi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!", 94, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!" + "'", str3, "\nhi!");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\nhi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", pattern1, "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!" + "'", str3, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rhi!", " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!" + "'", str3, "\rhi!");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 91, (-72));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi! ", (java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) "\n", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", false, 42, (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 72, 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!", "\n", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\nhi!hi!", "\r", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 0, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "\nhi!\r\nhi!hi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (int) (byte) -1, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\nhi!hi!", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi!????hi!hi!hi!????hi!????hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!", 12, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", pattern1, "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        char[] charArray10 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi!", 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\n\rhi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!? hi!hi!hi!? hi!? hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (-22), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\nhi!hi!", "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, (int) (short) 100, (java.lang.CharSequence) "\rhi!", 16, (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (int) (short) 10, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", "\nhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi! ", "\n\r\nhi!\r\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!hi!", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", 22, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\nhi!", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!", (java.lang.CharSequence) "\n", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\n", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) "\n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\nhi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi! ", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rhi!", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        char[] charArray8 = new char[] {};
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!\n\rhi!", charArray8);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", 91, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", "hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi!??hi!hi!h???hi!??hi!hi!i???hi!??hi!hi!!???hi!??hi!hi!????hi!??hi!hi!h???hi!??hi!hi!i???hi!??hi!hi!!???hi!??hi!hi!h???hi!??hi!hi!i???hi!??hi!hi!!???hi!??hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi! ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 15, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, "\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!", "\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!", "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\r\nhi!\r\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", (int) '\r', (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", " ", "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (int) '\n', (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", pattern1, "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!" + "'", str3, "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!", "\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\nhi!\r\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\nhi!hi!", (-72), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        char[] charArray8 = new char[] { 'a', ' ', '4', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a,  , 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true, (-51), (java.lang.CharSequence) "hi!\nhi!hi!", (-72), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", pattern1, "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n\nhi!", "\nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!\n\rhi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 2, (java.lang.CharSequence) "\n\r\nhi!", 42, (-12));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", 19, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!", pattern1, "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!" + "'", str3, "\rhi!");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n\nhi!", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi! ", false, 5, (java.lang.CharSequence) "hi!\nhi!", 164, (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-14));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\r\nhi!hi!hi!\nhi!", (java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\nhi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!" + "'", str3, "\n\nhi!");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass4 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi!", "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!" + "'", str3, "\n\r\nhi!");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!\n\rhi!", (java.lang.CharSequence) "hi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!", 34, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", false, (-39), (java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (int) 'a', 94);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\nhi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!", 95, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", "", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\nhi!\r\nhi!hi!", "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\nhi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", true, 10, (java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!", (int) (short) 0, 76);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!", "\n\r\nhi!\r\n\r\nhi!hi!hi!\r\n\r\nhi!\r\n\r\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!" + "'", str3, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!", "\n\r\nhi!", "\rhi!\n\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!" + "'", str3, "hi!\nhi!");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-106) + "'", int3 == (-106));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\rhi!\n\rhi!", "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi!\r\nhi!hi!", "hi!\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", 16, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", 100, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (java.lang.CharSequence) "\rhi!\n\rhi!", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "\n", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rhi!", "\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rhi!", (java.lang.CharSequence) " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!", pattern1, "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!" + "'", str3, "\nhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", "\n", "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!" + "'", str3, "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\r\nhi!hi!hi!\nhi!", "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!", "\rhi!", "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!" + "'", str3, " hi!\r hi!hi!hi!\r hi!\r hi!hi!hi!hi!");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, (-12), (java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (-3), (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\n\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\ni\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n!\n\r\n\n\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n", 42);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!\n\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!h\n\r\nhi!i\n\r\nhi!!\n\r\nhi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 2, (java.lang.CharSequence) "\nhi! ", (int) (short) 1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", 1, (-106));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi!\nhi!hi!", "\nhi!hi!\nhi!\nhi!hi!", "\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\nhi!hi!" + "'", str3, "hi!\nhi!\nhi!hi!");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!\n\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!h\n\r\nhi!\r\nhi!hi!i\n\r\nhi!\r\nhi!hi!!\n\r\nhi!\r\nhi!hi!", (java.lang.CharSequence) "\rhi!\n\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi!hi!\r\n\r\nhi!hi!hi!", pattern1, "\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!" + "'", str3, "\n\r\nhi!hi!\r\n\r\nhi!hi!hi!");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", pattern1, "\n\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n" + "'", str3, "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        char[] charArray7 = new char[] {};
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi!", charArray7);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi!", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hi!", "hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\rhi!\nhi!\rhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi!", (java.lang.CharSequence) "hi!\nhi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!", pattern1, "\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!\r\nhi!\r\nhi!hi!hi!\nhi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!" + "'", str3, "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!hi!\r\nhi!hi!\nhi!\nhi!hi!hi!hi!hi!\nhi!hi!\nhi!\nhi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70 + "'", int1 == 70);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\n\r\n\r\n\n\n\r\nh\n\r\ni\n\r\n!\n\r\nh\n\r\ni\n\r\n!\n\r\n", (int) (byte) 1, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!", (java.lang.CharSequence) "\nhi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\nhi!hi!\nhi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rhi!\n\rhi!", "\nhi!hi!\nhi!\nhi!hi!", "\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!\n\rhi!" + "'", str3, "\rhi!\n\rhi!");
    }
}

